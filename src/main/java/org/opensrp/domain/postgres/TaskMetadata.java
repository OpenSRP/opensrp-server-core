package org.opensrp.domain.postgres;

import java.util.Date;

public class TaskMetadata {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.task_metadata.id
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.task_metadata.task_id
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    private Long taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.task_metadata.identifier
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    private String identifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.task_metadata.plan_identifier
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    private String planIdentifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.task_metadata.group_identifier
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    private String groupIdentifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.task_metadata.for_entity
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    private String forEntity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.task_metadata.server_version
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    private Long serverVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.task_metadata.owner
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    private String owner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.task_metadata.code
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.task_metadata.date_created
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    private Date dateCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.task_metadata.date_edited
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    private Date dateEdited;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.task_metadata.id
     *
     * @return the value of core.task_metadata.id
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.task_metadata.id
     *
     * @param id the value for core.task_metadata.id
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.task_metadata.task_id
     *
     * @return the value of core.task_metadata.task_id
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.task_metadata.task_id
     *
     * @param taskId the value for core.task_metadata.task_id
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.task_metadata.identifier
     *
     * @return the value of core.task_metadata.identifier
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.task_metadata.identifier
     *
     * @param identifier the value for core.task_metadata.identifier
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.task_metadata.plan_identifier
     *
     * @return the value of core.task_metadata.plan_identifier
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public String getPlanIdentifier() {
        return planIdentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.task_metadata.plan_identifier
     *
     * @param planIdentifier the value for core.task_metadata.plan_identifier
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public void setPlanIdentifier(String planIdentifier) {
        this.planIdentifier = planIdentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.task_metadata.group_identifier
     *
     * @return the value of core.task_metadata.group_identifier
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public String getGroupIdentifier() {
        return groupIdentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.task_metadata.group_identifier
     *
     * @param groupIdentifier the value for core.task_metadata.group_identifier
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public void setGroupIdentifier(String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.task_metadata.for_entity
     *
     * @return the value of core.task_metadata.for_entity
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public String getForEntity() {
        return forEntity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.task_metadata.for_entity
     *
     * @param forEntity the value for core.task_metadata.for_entity
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public void setForEntity(String forEntity) {
        this.forEntity = forEntity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.task_metadata.server_version
     *
     * @return the value of core.task_metadata.server_version
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public Long getServerVersion() {
        return serverVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.task_metadata.server_version
     *
     * @param serverVersion the value for core.task_metadata.server_version
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public void setServerVersion(Long serverVersion) {
        this.serverVersion = serverVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.task_metadata.owner
     *
     * @return the value of core.task_metadata.owner
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public String getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.task_metadata.owner
     *
     * @param owner the value for core.task_metadata.owner
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.task_metadata.code
     *
     * @return the value of core.task_metadata.code
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.task_metadata.code
     *
     * @param code the value for core.task_metadata.code
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.task_metadata.date_created
     *
     * @return the value of core.task_metadata.date_created
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.task_metadata.date_created
     *
     * @param dateCreated the value for core.task_metadata.date_created
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.task_metadata.date_edited
     *
     * @return the value of core.task_metadata.date_edited
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public Date getDateEdited() {
        return dateEdited;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.task_metadata.date_edited
     *
     * @param dateEdited the value for core.task_metadata.date_edited
     *
     * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
     */
    public void setDateEdited(Date dateEdited) {
        this.dateEdited = dateEdited;
    }
}