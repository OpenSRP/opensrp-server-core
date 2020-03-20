package org.opensrp.repository.postgres.mapper;

import org.apache.ibatis.annotations.Param;
import org.opensrp.domain.postgres.TaskMetadata;
import org.opensrp.domain.postgres.TaskMetadataExample;

import java.util.List;

public interface TaskMetadataMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.task_metadata
	 * @mbg.generated  Fri May 10 21:21:43 EAT 2019
	 */
	long countByExample(TaskMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.task_metadata
	 * @mbg.generated  Fri May 10 21:21:43 EAT 2019
	 */
	int deleteByExample(TaskMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.task_metadata
	 * @mbg.generated  Fri May 10 21:21:43 EAT 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.task_metadata
	 * @mbg.generated  Fri May 10 21:21:43 EAT 2019
	 */
	int insert(TaskMetadata record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.task_metadata
	 * @mbg.generated  Fri May 10 21:21:43 EAT 2019
	 */
	int insertSelective(TaskMetadata record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.task_metadata
	 * @mbg.generated  Fri May 10 21:21:43 EAT 2019
	 */
	List<TaskMetadata> selectByExample(TaskMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.task_metadata
	 * @mbg.generated  Fri May 10 21:21:43 EAT 2019
	 */
	TaskMetadata selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.task_metadata
	 * @mbg.generated  Fri May 10 21:21:43 EAT 2019
	 */
	int updateByExampleSelective(@Param("record") TaskMetadata record, @Param("example") TaskMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.task_metadata
	 * @mbg.generated  Fri May 10 21:21:43 EAT 2019
	 */
	int updateByExample(@Param("record") TaskMetadata record, @Param("example") TaskMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.task_metadata
	 * @mbg.generated  Fri May 10 21:21:43 EAT 2019
	 */
	int updateByPrimaryKeySelective(TaskMetadata record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.task_metadata
	 * @mbg.generated  Fri May 10 21:21:43 EAT 2019
	 */
	int updateByPrimaryKey(TaskMetadata record);
}