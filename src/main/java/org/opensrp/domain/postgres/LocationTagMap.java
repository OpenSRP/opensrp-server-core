package org.opensrp.domain.postgres;

public class LocationTagMap {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.location_tag_map.location_id
     *
     * @mbggenerated Sun Mar 22 10:04:15 BDT 2020
     */
    private Long locationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.location_tag_map.location_tag_id
     *
     * @mbggenerated Sun Mar 22 10:04:15 BDT 2020
     */
    private Long locationTagId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.location_tag_map.location_id
     *
     * @return the value of core.location_tag_map.location_id
     *
     * @mbggenerated Sun Mar 22 10:04:15 BDT 2020
     */
    public Long getLocationId() {
        return locationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.location_tag_map.location_id
     *
     * @param locationId the value for core.location_tag_map.location_id
     *
     * @mbggenerated Sun Mar 22 10:04:15 BDT 2020
     */
    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.location_tag_map.location_tag_id
     *
     * @return the value of core.location_tag_map.location_tag_id
     *
     * @mbggenerated Sun Mar 22 10:04:15 BDT 2020
     */
    public Long getLocationTagId() {
        return locationTagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.location_tag_map.location_tag_id
     *
     * @param locationTagId the value for core.location_tag_map.location_tag_id
     *
     * @mbggenerated Sun Mar 22 10:04:15 BDT 2020
     */
    public void setLocationTagId(Long locationTagId) {
        this.locationTagId = locationTagId;
    }
}