package org.opensrp.domain.postgres;

import java.util.Date;

public class StructureMetadata {
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.structure_metadata.id
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private Long id;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.structure_metadata.structure_id
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private Long structureId;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.structure_metadata.geojson_id
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private String geojsonId;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.structure_metadata.type
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private String type;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.structure_metadata.parent_id
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private String parentId;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.structure_metadata.uuid
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private String uuid;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.structure_metadata.status
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private String status;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.structure_metadata.server_version
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private Long serverVersion;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.structure_metadata.name
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private String name;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.structure_metadata.date_created
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private Date dateCreated;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.structure_metadata.date_edited
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private Date dateEdited;
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.structure_metadata.id
	 *
	 * @return the value of core.structure_metadata.id
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.structure_metadata.id
	 *
	 * @param id the value for core.structure_metadata.id
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.structure_metadata.structure_id
	 *
	 * @return the value of core.structure_metadata.structure_id
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public Long getStructureId() {
		return structureId;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.structure_metadata.structure_id
	 *
	 * @param structureId the value for core.structure_metadata.structure_id
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setStructureId(Long structureId) {
		this.structureId = structureId;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.structure_metadata.geojson_id
	 *
	 * @return the value of core.structure_metadata.geojson_id
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public String getGeojsonId() {
		return geojsonId;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.structure_metadata.geojson_id
	 *
	 * @param geojsonId the value for core.structure_metadata.geojson_id
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setGeojsonId(String geojsonId) {
		this.geojsonId = geojsonId;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.structure_metadata.type
	 *
	 * @return the value of core.structure_metadata.type
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.structure_metadata.type
	 *
	 * @param type the value for core.structure_metadata.type
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.structure_metadata.parent_id
	 *
	 * @return the value of core.structure_metadata.parent_id
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public String getParentId() {
		return parentId;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.structure_metadata.parent_id
	 *
	 * @param parentId the value for core.structure_metadata.parent_id
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.structure_metadata.uuid
	 *
	 * @return the value of core.structure_metadata.uuid
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public String getUuid() {
		return uuid;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.structure_metadata.uuid
	 *
	 * @param uuid the value for core.structure_metadata.uuid
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.structure_metadata.status
	 *
	 * @return the value of core.structure_metadata.status
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.structure_metadata.status
	 *
	 * @param status the value for core.structure_metadata.status
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.structure_metadata.server_version
	 *
	 * @return the value of core.structure_metadata.server_version
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public Long getServerVersion() {
		return serverVersion;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.structure_metadata.server_version
	 *
	 * @param serverVersion the value for core.structure_metadata.server_version
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setServerVersion(Long serverVersion) {
		this.serverVersion = serverVersion;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.structure_metadata.name
	 *
	 * @return the value of core.structure_metadata.name
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.structure_metadata.name
	 *
	 * @param name the value for core.structure_metadata.name
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.structure_metadata.date_created
	 *
	 * @return the value of core.structure_metadata.date_created
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.structure_metadata.date_created
	 *
	 * @param dateCreated the value for core.structure_metadata.date_created
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.structure_metadata.date_edited
	 *
	 * @return the value of core.structure_metadata.date_edited
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public Date getDateEdited() {
		return dateEdited;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.structure_metadata.date_edited
	 *
	 * @param dateEdited the value for core.structure_metadata.date_edited
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setDateEdited(Date dateEdited) {
		this.dateEdited = dateEdited;
	}
}
