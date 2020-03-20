package org.opensrp.repository.postgres.mapper;

import org.apache.ibatis.annotations.Param;
import org.opensrp.domain.postgres.Event;
import org.opensrp.domain.postgres.EventExample;

import java.util.List;

public interface EventMapper {
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.event
	 * 
	 * @mbg.generated Fri Apr 06 16:01:06 EAT 2018
	 */
	long countByExample(EventExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.event
	 * 
	 * @mbg.generated Fri Apr 06 16:01:06 EAT 2018
	 */
	int deleteByExample(EventExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.event
	 * 
	 * @mbg.generated Fri Apr 06 16:01:06 EAT 2018
	 */
	int deleteByPrimaryKey(Long id);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.event
	 * 
	 * @mbg.generated Fri Apr 06 16:01:06 EAT 2018
	 */
	int insert(Event record);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.event
	 * 
	 * @mbg.generated Fri Apr 06 16:01:06 EAT 2018
	 */
	int insertSelective(Event record);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.event
	 * 
	 * @mbg.generated Fri Apr 06 16:01:06 EAT 2018
	 */
	List<Event> selectByExample(EventExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.event
	 * 
	 * @mbg.generated Fri Apr 06 16:01:06 EAT 2018
	 */
	Event selectByPrimaryKey(Long id);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.event
	 * 
	 * @mbg.generated Fri Apr 06 16:01:06 EAT 2018
	 */
	int updateByExampleSelective(@Param("record") Event record, @Param("example") EventExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.event
	 * 
	 * @mbg.generated Fri Apr 06 16:01:06 EAT 2018
	 */
	int updateByExample(@Param("record") Event record, @Param("example") EventExample example);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.event
	 * 
	 * @mbg.generated Fri Apr 06 16:01:06 EAT 2018
	 */
	int updateByPrimaryKeySelective(Event record);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * core.event
	 * 
	 * @mbg.generated Fri Apr 06 16:01:06 EAT 2018
	 */
	int updateByPrimaryKey(Event record);
}
