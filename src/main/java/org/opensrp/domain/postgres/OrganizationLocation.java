package org.opensrp.domain.postgres;

import java.util.Date;

public class OrganizationLocation {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column team.organization_location.id
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column team.organization_location.organization_id
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	private Long organizationId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column team.organization_location.location_id
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	private Long locationId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column team.organization_location.plan_id
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	private Long planId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column team.organization_location.from_date
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	private Date fromDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column team.organization_location.to_date
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	private Date toDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column team.organization_location.id
	 * @return  the value of team.organization_location.id
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column team.organization_location.id
	 * @param id  the value for team.organization_location.id
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column team.organization_location.organization_id
	 * @return  the value of team.organization_location.organization_id
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	public Long getOrganizationId() {
		return organizationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column team.organization_location.organization_id
	 * @param organizationId  the value for team.organization_location.organization_id
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column team.organization_location.location_id
	 * @return  the value of team.organization_location.location_id
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	public Long getLocationId() {
		return locationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column team.organization_location.location_id
	 * @param locationId  the value for team.organization_location.location_id
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column team.organization_location.plan_id
	 * @return  the value of team.organization_location.plan_id
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	public Long getPlanId() {
		return planId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column team.organization_location.plan_id
	 * @param planId  the value for team.organization_location.plan_id
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column team.organization_location.from_date
	 * @return  the value of team.organization_location.from_date
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column team.organization_location.from_date
	 * @param fromDate  the value for team.organization_location.from_date
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column team.organization_location.to_date
	 * @return  the value of team.organization_location.to_date
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column team.organization_location.to_date
	 * @param toDate  the value for team.organization_location.to_date
	 * @mbg.generated  Mon Sep 09 18:07:17 EAT 2019
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
}