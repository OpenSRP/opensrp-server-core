package org.opensrp.domain.postgres;

public class LocationTag {

	/**
     * This field was generated by MyBatis Generator. This field corresponds to the database column core.location_tag.id
     * @mbggenerated  Sun Mar 08 18:18:51 BDT 2020
     */
    private Long id;
	/**
     * This field was generated by MyBatis Generator. This field corresponds to the database column core.location_tag.name
     * @mbggenerated  Sun Mar 08 18:18:51 BDT 2020
     */
    private String name;
	/**
     * This field was generated by MyBatis Generator. This field corresponds to the database column core.location_tag.description
     * @mbggenerated  Sun Mar 08 18:18:51 BDT 2020
     */
    private String description;
	/**
     * This field was generated by MyBatis Generator. This field corresponds to the database column core.location_tag.active
     * @mbggenerated  Sun Mar 08 18:18:51 BDT 2020
     */
    private Boolean active;

	/**
     * This method was generated by MyBatis Generator. This method returns the value of the database column core.location_tag.id
     * @return  the value of core.location_tag.id
     * @mbggenerated  Sun Mar 08 18:18:51 BDT 2020
     */
    public Long getId() {
	    return id;
    }

	/**
     * This method was generated by MyBatis Generator. This method sets the value of the database column core.location_tag.id
     * @param id  the value for core.location_tag.id
     * @mbggenerated  Sun Mar 08 18:18:51 BDT 2020
     */
    public void setId(Long id) {
	    this.id = id;
    }

	/**
     * This method was generated by MyBatis Generator. This method returns the value of the database column core.location_tag.name
     * @return  the value of core.location_tag.name
     * @mbggenerated  Sun Mar 08 18:18:51 BDT 2020
     */
    public String getName() {
	    return name;
    }

	/**
     * This method was generated by MyBatis Generator. This method sets the value of the database column core.location_tag.name
     * @param name  the value for core.location_tag.name
     * @mbggenerated  Sun Mar 08 18:18:51 BDT 2020
     */
    public void setName(String name) {
	    this.name = name;
    }

	/**
     * This method was generated by MyBatis Generator. This method returns the value of the database column core.location_tag.description
     * @return  the value of core.location_tag.description
     * @mbggenerated  Sun Mar 08 18:18:51 BDT 2020
     */
    public String getDescription() {
	    return description;
    }

	/**
     * This method was generated by MyBatis Generator. This method sets the value of the database column core.location_tag.description
     * @param description  the value for core.location_tag.description
     * @mbggenerated  Sun Mar 08 18:18:51 BDT 2020
     */
    public void setDescription(String description) {
	    this.description = description;
    }

	/**
     * This method was generated by MyBatis Generator. This method returns the value of the database column core.location_tag.active
     * @return  the value of core.location_tag.active
     * @mbggenerated  Sun Mar 08 18:18:51 BDT 2020
     */
    public Boolean getActive() {
	    return active;
    }

	/**
     * This method was generated by MyBatis Generator. This method sets the value of the database column core.location_tag.active
     * @param active  the value for core.location_tag.active
     * @mbggenerated  Sun Mar 08 18:18:51 BDT 2020
     */
    public void setActive(Boolean active) {
	    this.active = active;
    }
}