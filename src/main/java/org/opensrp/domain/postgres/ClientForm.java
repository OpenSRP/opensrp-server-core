package org.opensrp.domain.postgres;

import java.util.Date;

public class ClientForm {

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column core.client_form.id
	 *
	 * @mbg.generated Fri Mar 20 12:11:34 EAT 2020
	 */
	private Long id;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column core.client_form.json
	 *
	 * @mbg.generated Fri Mar 20 12:11:34 EAT 2020
	 */
	private Object json;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column core.client_form.created_at
	 *
	 * @mbg.generated Fri Mar 20 12:11:34 EAT 2020
	 */
	private Date createdAt;

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column core.client_form.id
	 *
	 * @return the value of core.client_form.id
	 * @mbg.generated Fri Mar 20 12:11:34 EAT 2020
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column core.client_form.id
	 *
	 * @param id the value for core.client_form.id
	 * @mbg.generated Fri Mar 20 12:11:34 EAT 2020
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column core.client_form.json
	 *
	 * @return the value of core.client_form.json
	 * @mbg.generated Fri Mar 20 12:11:34 EAT 2020
	 */
	public Object getJson() {
		return json;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column core.client_form.json
	 *
	 * @param json the value for core.client_form.json
	 * @mbg.generated Fri Mar 20 12:11:34 EAT 2020
	 */
	public void setJson(Object json) {
		this.json = json;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column core.client_form.created_at
	 *
	 * @return the value of core.client_form.created_at
	 * @mbg.generated Fri Mar 20 12:11:34 EAT 2020
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column core.client_form.created_at
	 *
	 * @param createdAt the value for core.client_form.created_at
	 * @mbg.generated Fri Mar 20 12:11:34 EAT 2020
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}