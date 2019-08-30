package org.opensrp.repository.postgres.mapper;

import org.apache.ibatis.annotations.Param;
import org.opensrp.domain.postgres.PlanMetadataExample;
import org.opensrp.domain.postgres.PlanMetadataKey;

import java.util.List;
import org.opensrp.domain.postgres.PlanMetadata;

public interface PlanMetadataMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.plan_metadata
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	long countByExample(PlanMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.plan_metadata
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	int deleteByExample(PlanMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.plan_metadata
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	int insert(PlanMetadata record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.plan_metadata
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	int insertSelective(PlanMetadata record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.plan_metadata
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	List<PlanMetadata> selectByExample(PlanMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.plan_metadata
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	int updateByExampleSelective(@Param("record") PlanMetadata record, @Param("example") PlanMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.plan_metadata
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	int updateByExample(@Param("record") PlanMetadata record, @Param("example") PlanMetadataExample example);
}