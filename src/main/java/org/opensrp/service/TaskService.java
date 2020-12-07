package org.opensrp.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.joda.time.DateTime;
import org.smartregister.domain.Task;
import org.opensrp.domain.TaskUpdate;
import org.opensrp.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

	private static Logger logger = LoggerFactory.getLogger(TaskService.class.toString());

	private TaskRepository taskRepository;

	@Autowired
	public void setTaskRepository(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@PreAuthorize("hasRole('TASK_VIEW')")
	@PostFilter("hasPermission(filterObject, 'TASK_VIEW')")
	public List<Task> getAllTasks() {
		return taskRepository.getAll();
	}

	@PreAuthorize("hasPermission(#task,'Task', 'TASK_CREATE') and hasPermission(#task,'Task', 'TASK_UPDATE')")
	public void addOrUpdateTask(Task task) {
		if (StringUtils.isBlank(task.getIdentifier()))
			throw new IllegalArgumentException("Identifier not specified");
		task.setServerVersion(0l);
		task.setLastModified(new DateTime());
		if (taskRepository.get(task.getIdentifier()) != null) {
			taskRepository.update(task);
		} else {
			task.setAuthoredOn(new DateTime());
			taskRepository.add(task);
		}
	}

	@PreAuthorize("hasPermission(#task,'Task', 'TASK_CREATE')")
	public Task addTask(Task task) {
		if (StringUtils.isBlank(task.getIdentifier()))
			throw new IllegalArgumentException("Identifier not specified");
		task.setServerVersion(0l);
		task.setAuthoredOn(new DateTime());
		task.setLastModified(new DateTime());
		taskRepository.add(task);
		return task;

	}

	@PreAuthorize("hasPermission(#task,'Task', 'TASK_UPDATE')")
	public Task updateTask(Task task) {
		if (StringUtils.isBlank(task.getIdentifier()))
			throw new IllegalArgumentException("Identifier not specified");
		task.setServerVersion(0l);
		task.setLastModified(new DateTime());
		taskRepository.update(task);
		return task;
	}

	@PreAuthorize("hasRole('TASK_VIEW')")
	@PostAuthorize("hasPermission(returnObject, 'TASK_VIEW')")
	public Task getTask(String identifier) {
		if (StringUtils.isBlank(identifier))
			return null;
		return taskRepository.get(identifier);
	}

	@PreAuthorize("hasRole('TASK_VIEW')")
	@PostFilter("hasPermission(filterObject, 'TASK_VIEW')")
	public List<Task> getTasksByTaskAndGroup(String task, String group, long serverVersion) {
		return taskRepository.getTasksByPlanAndGroup(task, group, serverVersion);
	}

	@PreAuthorize("hasPermission(#tasks,'Task','TASK_CREATE') and hasPermission(#tasks,'Task','TASK_UPDATE')")
	public Set<String> saveTasks(List<Task> tasks) {
		Set<String> tasksWithErrors = new HashSet<>();
		for (Task task : tasks) {
			try {
				addOrUpdateTask(task);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				tasksWithErrors.add(task.getIdentifier());
			}
		}
		return tasksWithErrors;
	}

	@PreAuthorize("hasRole('TASK_VIEW') and hasRole('TASK_UPDATE')")
	public void addServerVersion() {
		try {
			List<Task> tasks = taskRepository.findByEmptyServerVersion();
			logger.info("RUNNING addServerVersion tasks size: " + tasks.size());
			long currentTimeMillis = System.currentTimeMillis();
			for (Task task : tasks) {
				try {
					Thread.sleep(1);
					task.setServerVersion(currentTimeMillis);
					taskRepository.update(task);
					currentTimeMillis += 1;
				} catch (InterruptedException e) {
					logger.error(e.getMessage());
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

	public static Task.TaskStatus fromString(String statusParam) {
		for (Task.TaskStatus status : Task.TaskStatus.values()) {
			if (status.name().equalsIgnoreCase(statusParam)) {
				return status;
			}
		}
		return null;
	}

	@PreAuthorize("hasPermission(#taskUpdates,'TaskUpdate','TASK_UPDATE')")
	public List<String> updateTaskStatus(List<TaskUpdate> taskUpdates) {
		List<String> updatedTaskIds = new ArrayList<>();
		for (TaskUpdate taskUpdate : taskUpdates) {
			Task task = taskRepository.get(taskUpdate.getIdentifier());
			try {
				Task.TaskStatus status = fromString(taskUpdate.getStatus());
				if (task != null && status != null) {
						task.setBusinessStatus(taskUpdate.getBusinessStatus());
						task.setStatus(status);
						task.setLastModified(new DateTime());
						task.setServerVersion(0l);
						taskRepository.update(task);
						updatedTaskIds.add(task.getIdentifier());
				}
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}
		return updatedTaskIds;
	}

	/**
	 * This method searches for all task Ids
	 *
	 * @param serverVersion
	 * @param limit upper limit on number of tasks ids to fetch
	 * @return a list of all task ids and last server version
	 */
	public Pair<List<String>, Long> findAllTaskIds(Long serverVersion, int limit) {
		return taskRepository.findAllIds(serverVersion, limit);
	}

	/**
	 *  This method searches for tasks ordered by serverVersion ascending
	 *
	 * @param serverVersion
	 * @param limit upper limit on number of tasks to fetch
	 * @return list of plan identifiers
	 */
	@PreAuthorize("hasRole('TASK_VIEW')")
	@PostFilter("hasPermission(filterObject, 'TASK_VIEW')")
	public List<Task> getAllTasks(Long serverVersion, int limit) {
		return taskRepository.getAllTasks(serverVersion, limit);
	}

	/**
	 * This method returns a list of tasks belonging to a particular owner
	 * @param plan plan identifier for the task
	 * @param owner the username of the person who initiated the task
	 * @param serverVersion Version of the server
	 * @return list of tasks created by the provider username (owner)
	 */
	@PreAuthorize("hasRole('TASK_VIEW')")
	@PostFilter("hasPermission(filterObject, 'TASK_VIEW')")
	public List<Task> getTasksByPlanAndOwner(String plan, String owner, long serverVersion) {
		return taskRepository.getTasksByPlanAndOwner(plan, owner, serverVersion);
	}

	/**
	 * This method returns a count of tasks belonging to a particular owner
	 * @param plan plan identifier for the task
	 * @param group the team who initiated the task
	 * @param serverVersion Version of the server
	 * @return count of tasks created by the provider username (owner)
	 */
	public Long countTasksByPlanAndGroup(String plan, String group, long serverVersion) {
		return taskRepository.countTasksByPlanAndGroup(plan, group, serverVersion);
	}

	/**
	 * This method returns a count of tasks belonging to a particular owner
	 * @param plan plan identifier for the task
	 * @param owner the username of the person who initiated the task
	 * @param serverVersion Version of the server
	 * @return count of tasks created by the provider username (owner)
	 */
	public Long countTasksByPlanAndOwner(String plan, String owner, long serverVersion) {
		return taskRepository.countTasksByPlanAndOwner(plan, owner,serverVersion);
	}
}
