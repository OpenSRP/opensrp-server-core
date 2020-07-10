package org.opensrp.repository.postgres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ibm.fhir.model.resource.QuestionnaireResponse;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.opensrp.domain.postgres.TaskMetadata;
import org.opensrp.domain.postgres.TaskMetadataExample;
import org.opensrp.repository.TaskRepository;
import org.opensrp.repository.postgres.mapper.custom.CustomTaskMapper;
import org.opensrp.repository.postgres.mapper.custom.CustomTaskMetadataMapper;
import org.smartregister.converters.TaskConverter;
import org.smartregister.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TaskRepositoryImpl extends BaseRepositoryImpl<Task> implements TaskRepository {

	@Autowired
	private CustomTaskMapper taskMapper;

	@Autowired
	private CustomTaskMetadataMapper taskMetadataMapper;

	@Override
	public Task get(String id) {
		if (StringUtils.isBlank(id)) {
			return null;
		}

		org.opensrp.domain.postgres.Task pgTask = taskMetadataMapper.selectByIdentifier(id);
		if (pgTask == null) {
			return null;
		}
		return convert(pgTask);
	}

	@Override
	@Transactional
	public void add(Task entity) {
		if (getUniqueField(entity) == null) {
			return;
		}

		if (retrievePrimaryKey(entity) != null) { // Task already added
			return;
		}

		org.opensrp.domain.postgres.Task pgTask = convert(entity, null);
		if (pgTask == null) {
			return;
		}

		int rowsAffected = taskMapper.insertSelectiveAndSetId(pgTask);
		if (rowsAffected < 1 || pgTask.getId() == null) {
			return;
		}

		TaskMetadata taskMetadata = createMetadata(entity, pgTask.getId());

		taskMetadataMapper.insertSelective(taskMetadata);

	}

	@Override
	@Transactional
	public void update(Task entity) {
		if (getUniqueField(entity) == null) {
			return;
		}

		Long id = retrievePrimaryKey(entity);
		if (id == null) { // Task does not exist
			return;
		}

		org.opensrp.domain.postgres.Task pgTask = convert(entity, id);
		if (pgTask == null) {
			return;
		}
		TaskMetadata taskMetadata = createMetadata(entity, pgTask.getId());

		int rowsAffected = taskMapper.updateByPrimaryKey(pgTask);
		if (rowsAffected < 1) {
			return;
		}

		TaskMetadataExample taskMetadataExample = new TaskMetadataExample();
		taskMetadataExample.createCriteria().andTaskIdEqualTo(id);
		taskMetadata.setId(taskMetadataMapper.selectByExample(taskMetadataExample).get(0).getId());
		taskMetadataMapper.updateByPrimaryKey(taskMetadata);

	}

	@Override
	public List<Task> getAll() {
		List<org.opensrp.domain.postgres.Task> tasks = taskMetadataMapper.selectMany(new TaskMetadataExample(), 0,
				DEFAULT_FETCH_SIZE);
		return convert(tasks);
	}

	@Override
	public List<Task> getTasksByPlanAndGroup(String plan, String group, long serverVersion) {
		List<String> plans = Arrays.asList(org.apache.commons.lang.StringUtils.split(plan, ","));
		List<String> groups = Arrays.asList(org.apache.commons.lang.StringUtils.split(group, ","));
		TaskMetadataExample taskMetadataExample = new TaskMetadataExample();
		taskMetadataExample.createCriteria().andPlanIdentifierIn(plans).andGroupIdentifierIn(groups)
				.andServerVersionGreaterThanOrEqualTo(serverVersion);
		taskMetadataExample.setOrderByClause(getOrderByClause(SERVER_VERSION, ASCENDING));
		List<org.opensrp.domain.postgres.Task> tasks = taskMetadataMapper.selectMany(taskMetadataExample, 0,
				DEFAULT_FETCH_SIZE);
		return convert(tasks);
	}

	@Override
	public List<Task> findByEmptyServerVersion() {
		TaskMetadataExample taskMetadataExample = new TaskMetadataExample();
		taskMetadataExample.createCriteria().andServerVersionIsNull();
		taskMetadataExample.or(taskMetadataExample.createCriteria().andServerVersionEqualTo(0l));
		List<org.opensrp.domain.postgres.Task> tasks = taskMetadataMapper.selectMany(taskMetadataExample, 0,
				DEFAULT_FETCH_SIZE);
		return convert(tasks);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Pair<List<String>, Long> findAllIds(Long serverVersion, int limit) {
		Long lastServerVersion = null;
		TaskMetadataExample taskMetadataExample = new TaskMetadataExample();
		taskMetadataExample.createCriteria().andServerVersionGreaterThanOrEqualTo(serverVersion);
		taskMetadataExample.setOrderByClause(getOrderByClause(SERVER_VERSION, ASCENDING));
		int fetchLimit = limit > 0 ? limit : DEFAULT_FETCH_SIZE;

		List<String> taskIdentifiers = taskMetadataMapper.selectManyIds(taskMetadataExample, 0,
				fetchLimit);

		if (taskIdentifiers != null && !taskIdentifiers.isEmpty()) {
			taskMetadataExample = new TaskMetadataExample();
			taskMetadataExample.createCriteria().andIdentifierEqualTo(taskIdentifiers.get(taskIdentifiers.size() - 1));
			List<TaskMetadata> taskMetaDataList = taskMetadataMapper.selectByExample(taskMetadataExample);

			lastServerVersion = taskMetaDataList != null && !taskMetaDataList.isEmpty() ?
					taskMetaDataList.get(0).getServerVersion() : 0;

		}

		return Pair.of(taskIdentifiers, lastServerVersion);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Task> getAllTasks(Long serverVersion, int limit) {
		TaskMetadataExample taskMetadataExample = new TaskMetadataExample();
		taskMetadataExample.createCriteria().andServerVersionGreaterThanOrEqualTo(serverVersion);
		taskMetadataExample.setOrderByClause(getOrderByClause(SERVER_VERSION, ASCENDING));

		List<org.opensrp.domain.postgres.Task> tasks = taskMetadataMapper.selectMany(taskMetadataExample, 0, limit);
		return convert(tasks);
	}

	@Override
	public List<Task> getTasksByPlanAndOwner(String plan, String owner, long serverVersion) {
		List<String> plans = Arrays.asList(org.apache.commons.lang.StringUtils.split(plan, ","));
		TaskMetadataExample taskMetadataExample = new TaskMetadataExample();
		taskMetadataExample.createCriteria().andPlanIdentifierIn(plans)
				.andOwnerEqualTo(owner)
		        .andServerVersionGreaterThanOrEqualTo(serverVersion);
		taskMetadataExample.setOrderByClause(getOrderByClause(SERVER_VERSION, ASCENDING));
		List<org.opensrp.domain.postgres.Task> tasks = taskMetadataMapper.selectMany(taskMetadataExample, 0,
				DEFAULT_FETCH_SIZE);
		return convert(tasks);
	}

	@Override
	public Long countTasksByPlanAndGroup(String plan, String group, long serverVersion) {
		List<String> campaigns = Arrays.asList(org.apache.commons.lang.StringUtils.split(plan, ","));
		List<String> groups = Arrays.asList(org.apache.commons.lang.StringUtils.split(group, ","));
		TaskMetadataExample taskMetadataExample = new TaskMetadataExample();
		taskMetadataExample.createCriteria().andPlanIdentifierIn(campaigns).andGroupIdentifierIn(groups)
				.andServerVersionGreaterThanOrEqualTo(serverVersion);
		return taskMetadataMapper.countByExample(taskMetadataExample);
	}

	@Override
	public Long countTasksByPlanAndOwner(String plan, String owner, long serverVersion) {
		List<String> plans = Arrays.asList(org.apache.commons.lang.StringUtils.split(plan, ","));
		TaskMetadataExample taskMetadataExample = new TaskMetadataExample();
		taskMetadataExample.createCriteria().andPlanIdentifierIn(plans)
				.andOwnerEqualTo(owner).andServerVersionGreaterThanOrEqualTo(serverVersion);
		return taskMetadataMapper.countByExample(taskMetadataExample);
	}

	@Override
	@Transactional
	public void safeRemove(Task entity) {
		if (entity == null) {
			return;
		}

		Long id = retrievePrimaryKey(entity);
		if (id == null) {
			return;
		}

		TaskMetadataExample taskMetadataExample = new TaskMetadataExample();
		taskMetadataExample.createCriteria().andTaskIdEqualTo(id);
		int rowsAffected = taskMetadataMapper.deleteByExample(taskMetadataExample);
		if (rowsAffected < 1) {
			return;
		}

		taskMapper.deleteByPrimaryKey(id);

	}

	@Override
	protected Long retrievePrimaryKey(Task task) {
		Object uniqueId = getUniqueField(task);
		if (uniqueId == null) {
			return null;
		}

		String identifier = uniqueId.toString();

		org.opensrp.domain.postgres.Task pgTask = taskMetadataMapper.selectByIdentifier(identifier);
		if (pgTask == null) {
			return null;
		}
		return pgTask.getId();
	}

	@Override
	protected Object getUniqueField(Task task) {
		if (task == null) {
			return null;
		}
		return task.getIdentifier();
	}

	private Task convert(org.opensrp.domain.postgres.Task pgTask) {
		if (pgTask == null || pgTask.getJson() == null || !(pgTask.getJson() instanceof Task)) {
			return null;
		}
		return (Task) pgTask.getJson();
	}

	private org.opensrp.domain.postgres.Task convert(Task task, Long primaryKey) {
		if (task == null) {
			return null;
		}

		org.opensrp.domain.postgres.Task pgTask = new org.opensrp.domain.postgres.Task();
		pgTask.setId(primaryKey);
		pgTask.setJson(task);

		return pgTask;
	}

	private List<Task> convert(List<org.opensrp.domain.postgres.Task> tasks) {
		if (tasks == null || tasks.isEmpty()) {
			return new ArrayList<>();
		}

		List<Task> convertedTasks = new ArrayList<>();
		for (org.opensrp.domain.postgres.Task task : tasks) {
			Task convertedTask = convert(task);
			if (convertedTask != null) {
				convertedTasks.add(convertedTask);
			}
		}

		return convertedTasks;
	}

	private TaskMetadata createMetadata(Task entity, Long id) {
		TaskMetadata taskMetadata = new TaskMetadata();
		taskMetadata.setTaskId(id);
		taskMetadata.setIdentifier(entity.getIdentifier());
		taskMetadata.setPlanIdentifier(entity.getPlanIdentifier());
		taskMetadata.setGroupIdentifier(entity.getGroupIdentifier());
		taskMetadata.setForEntity(entity.getForEntity());
		taskMetadata.setServerVersion(entity.getServerVersion());
		taskMetadata.setOwner(entity.getOwner());
		taskMetadata.setCode(entity.getCode());
		return taskMetadata;
	}

	
	@Override
	public List<com.ibm.fhir.model.resource.Task> findTasksForEntity(String id, String planIdentifier) {
		TaskMetadataExample example = new TaskMetadataExample();
		example.createCriteria().andPlanIdentifierEqualTo(planIdentifier).andForEntityEqualTo(id);
		return convertToFHIRTasks(convert(taskMetadataMapper.selectMany(example, 0, DEFAULT_FETCH_SIZE)));
	}

	@Override
	public void saveTask(Task task, QuestionnaireResponse questionnaireResponse) {
         add(task);
	}

	@Override
	public boolean checkIfTaskExists(String baseEntityId, String planIdentifier, String code) {
		List<String> statuses = new ArrayList<>();
		statuses.add("Cancelled");
		statuses.add("Archived");

		int taskCount = taskMetadataMapper.countTasksByEntityIdAndPlanIdentifierAndCode(baseEntityId, planIdentifier, code,statuses);
		return taskCount >= 1;
	}

	@Override
	public List<com.ibm.fhir.model.resource.Task> findAllTasksForEntity(String id) {
		TaskMetadataExample example = new TaskMetadataExample();
		example.createCriteria().andForEntityEqualTo(id);
		return convertToFHIRTasks(convert(taskMetadataMapper.selectMany(example, 0, DEFAULT_FETCH_SIZE)));
	}

	private List<com.ibm.fhir.model.resource.Task> convertToFHIRTasks(List<Task> tasks) {
		return tasks
				.stream()
				.map(task -> TaskConverter.convertTasktoFihrResource(task))
				.collect(Collectors.toList());
	}


}
