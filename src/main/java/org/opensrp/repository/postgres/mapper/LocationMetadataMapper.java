package org.opensrp.repository.postgres.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.opensrp.domain.postgres.LocationMetadata;
import org.opensrp.domain.postgres.LocationMetadataExample;

public interface LocationMetadataMapper {
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.location_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	long countByExample(LocationMetadataExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.location_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int deleteByExample(LocationMetadataExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.location_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int deleteByPrimaryKey(Long id);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.location_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int insert(LocationMetadata record);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.location_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int insertSelective(LocationMetadata record);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.location_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	List<LocationMetadata> selectByExample(LocationMetadataExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.location_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	LocationMetadata selectByPrimaryKey(Long id);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.location_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int updateByExampleSelective(@Param("record") LocationMetadata record,
	        @Param("example") LocationMetadataExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.location_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int updateByExample(@Param("record") LocationMetadata record, @Param("example") LocationMetadataExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.location_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int updateByPrimaryKeySelective(LocationMetadata record);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.location_metadata
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	int updateByPrimaryKey(LocationMetadata record);
}
