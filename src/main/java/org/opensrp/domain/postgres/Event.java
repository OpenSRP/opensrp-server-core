package org.opensrp.domain.postgres;

import java.util.Date;

public class Event {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core.event.id
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core.event.json
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	private Object json;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core.event.date_deleted
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	private Date dateDeleted;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core.event.server_version
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	private Long serverVersion;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core.event.id
	 * @return  the value of core.event.id
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core.event.id
	 * @param id  the value for core.event.id
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core.event.json
	 * @return  the value of core.event.json
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public Object getJson() {
		return json;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core.event.json
	 * @param json  the value for core.event.json
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public void setJson(Object json) {
		this.json = json;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core.event.date_deleted
	 * @return  the value of core.event.date_deleted
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public Date getDateDeleted() {
		return dateDeleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core.event.date_deleted
	 * @param dateDeleted  the value for core.event.date_deleted
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public void setDateDeleted(Date dateDeleted) {
		this.dateDeleted = dateDeleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core.event.server_version
	 * @return  the value of core.event.server_version
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public Long getServerVersion() {
		return serverVersion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core.event.server_version
	 * @param serverVersion  the value for core.event.server_version
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public void setServerVersion(Long serverVersion) {
		this.serverVersion = serverVersion;
	}
}
