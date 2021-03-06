package org.opensrp.domain.postgres;

import java.util.Date;

public class ClientMigrationFile {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.client_migration_file.id
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.client_migration_file.identifier
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    private String identifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.client_migration_file.filename
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    private String filename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.client_migration_file.on_object_storage
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    private Boolean onObjectStorage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.client_migration_file.object_storage_path
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    private String objectStoragePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.client_migration_file.jurisdiction
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    private String jurisdiction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.client_migration_file.version
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.client_migration_file.manifest_id
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    private Integer manifestId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.client_migration_file.file_contents
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    private String fileContents;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.client_migration_file.created_at
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.client_migration_file.id
     *
     * @return the value of core.client_migration_file.id
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.client_migration_file.id
     *
     * @param id the value for core.client_migration_file.id
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.client_migration_file.identifier
     *
     * @return the value of core.client_migration_file.identifier
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.client_migration_file.identifier
     *
     * @param identifier the value for core.client_migration_file.identifier
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.client_migration_file.filename
     *
     * @return the value of core.client_migration_file.filename
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.client_migration_file.filename
     *
     * @param filename the value for core.client_migration_file.filename
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.client_migration_file.on_object_storage
     *
     * @return the value of core.client_migration_file.on_object_storage
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public Boolean getOnObjectStorage() {
        return onObjectStorage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.client_migration_file.on_object_storage
     *
     * @param onObjectStorage the value for core.client_migration_file.on_object_storage
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public void setOnObjectStorage(Boolean onObjectStorage) {
        this.onObjectStorage = onObjectStorage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.client_migration_file.object_storage_path
     *
     * @return the value of core.client_migration_file.object_storage_path
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public String getObjectStoragePath() {
        return objectStoragePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.client_migration_file.object_storage_path
     *
     * @param objectStoragePath the value for core.client_migration_file.object_storage_path
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public void setObjectStoragePath(String objectStoragePath) {
        this.objectStoragePath = objectStoragePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.client_migration_file.jurisdiction
     *
     * @return the value of core.client_migration_file.jurisdiction
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public String getJurisdiction() {
        return jurisdiction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.client_migration_file.jurisdiction
     *
     * @param jurisdiction the value for core.client_migration_file.jurisdiction
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.client_migration_file.version
     *
     * @return the value of core.client_migration_file.version
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.client_migration_file.version
     *
     * @param version the value for core.client_migration_file.version
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.client_migration_file.manifest_id
     *
     * @return the value of core.client_migration_file.manifest_id
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public Integer getManifestId() {
        return manifestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.client_migration_file.manifest_id
     *
     * @param manifestId the value for core.client_migration_file.manifest_id
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public void setManifestId(Integer manifestId) {
        this.manifestId = manifestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.client_migration_file.file_contents
     *
     * @return the value of core.client_migration_file.file_contents
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public String getFileContents() {
        return fileContents;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.client_migration_file.file_contents
     *
     * @param fileContents the value for core.client_migration_file.file_contents
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public void setFileContents(String fileContents) {
        this.fileContents = fileContents;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.client_migration_file.created_at
     *
     * @return the value of core.client_migration_file.created_at
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.client_migration_file.created_at
     *
     * @param createdAt the value for core.client_migration_file.created_at
     *
     * @mbg.generated Mon Feb 08 12:11:26 EAT 2021
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}