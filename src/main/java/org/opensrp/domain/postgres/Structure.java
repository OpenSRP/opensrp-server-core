package org.opensrp.domain.postgres;

public class Structure {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core.structure.id
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core.structure.json
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	private Object json;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core.structure.server_version
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	private Long serverVersion;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core.structure.id
	 * @return  the value of core.structure.id
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core.structure.id
	 * @param id  the value for core.structure.id
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core.structure.json
	 * @return  the value of core.structure.json
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public Object getJson() {
		return json;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core.structure.json
	 * @param json  the value for core.structure.json
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public void setJson(Object json) {
		this.json = json;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core.structure.server_version
	 * @return  the value of core.structure.server_version
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public Long getServerVersion() {
		return serverVersion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core.structure.server_version
	 * @param serverVersion  the value for core.structure.server_version
	 * @mbg.generated  Wed Nov 25 14:17:23 EAT 2020
	 */
	public void setServerVersion(Long serverVersion) {
		this.serverVersion = serverVersion;
	}
}