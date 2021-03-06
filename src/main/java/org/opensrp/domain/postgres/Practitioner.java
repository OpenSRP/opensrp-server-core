package org.opensrp.domain.postgres;

import java.util.Date;

public class Practitioner {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team.practitioner.id
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team.practitioner.identifier
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    private String identifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team.practitioner.active
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    private Boolean active;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team.practitioner.name
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team.practitioner.user_id
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team.practitioner.username
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team.practitioner.date_deleted
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    private Date dateDeleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team.practitioner.id
     *
     * @return the value of team.practitioner.id
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team.practitioner.id
     *
     * @param id the value for team.practitioner.id
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team.practitioner.identifier
     *
     * @return the value of team.practitioner.identifier
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team.practitioner.identifier
     *
     * @param identifier the value for team.practitioner.identifier
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team.practitioner.active
     *
     * @return the value of team.practitioner.active
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team.practitioner.active
     *
     * @param active the value for team.practitioner.active
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team.practitioner.name
     *
     * @return the value of team.practitioner.name
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team.practitioner.name
     *
     * @param name the value for team.practitioner.name
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team.practitioner.user_id
     *
     * @return the value of team.practitioner.user_id
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team.practitioner.user_id
     *
     * @param userId the value for team.practitioner.user_id
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team.practitioner.username
     *
     * @return the value of team.practitioner.username
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team.practitioner.username
     *
     * @param username the value for team.practitioner.username
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team.practitioner.date_deleted
     *
     * @return the value of team.practitioner.date_deleted
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public Date getDateDeleted() {
        return dateDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team.practitioner.date_deleted
     *
     * @param dateDeleted the value for team.practitioner.date_deleted
     *
     * @mbg.generated Fri Aug 30 16:08:23 EAT 2019
     */
    public void setDateDeleted(Date dateDeleted) {
        this.dateDeleted = dateDeleted;
    }
}