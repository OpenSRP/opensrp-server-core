package org.opensrp.repository.postgres.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.opensrp.domain.postgres.ClientFormMetadata;
import org.opensrp.domain.postgres.ClientFormMetadataExample;

public interface ClientFormMetadataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.client_form_metadata
     *
     * @mbg.generated Fri Aug 16 14:03:07 EAT 2019
     */
    long countByExample(ClientFormMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.client_form_metadata
     *
     * @mbg.generated Fri Aug 16 14:03:07 EAT 2019
     */
    int deleteByExample(ClientFormMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.client_form_metadata
     *
     * @mbg.generated Fri Aug 16 14:03:07 EAT 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.client_form_metadata
     *
     * @mbg.generated Fri Aug 16 14:03:07 EAT 2019
     */
    int insert(ClientFormMetadata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.client_form_metadata
     *
     * @mbg.generated Fri Aug 16 14:03:07 EAT 2019
     */
    int insertSelective(ClientFormMetadata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.client_form_metadata
     *
     * @mbg.generated Fri Aug 16 14:03:07 EAT 2019
     */
    List<ClientFormMetadata> selectByExample(ClientFormMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.client_form_metadata
     *
     * @mbg.generated Fri Aug 16 14:03:07 EAT 2019
     */
    ClientFormMetadata selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.client_form_metadata
     *
     * @mbg.generated Fri Aug 16 14:03:07 EAT 2019
     */
    int updateByExampleSelective(@Param("record") ClientFormMetadata record, @Param("example") ClientFormMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.client_form_metadata
     *
     * @mbg.generated Fri Aug 16 14:03:07 EAT 2019
     */
    int updateByExample(@Param("record") ClientFormMetadata record, @Param("example") ClientFormMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.client_form_metadata
     *
     * @mbg.generated Fri Aug 16 14:03:07 EAT 2019
     */
    int updateByPrimaryKeySelective(ClientFormMetadata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.client_form_metadata
     *
     * @mbg.generated Fri Aug 16 14:03:07 EAT 2019
     */
    int updateByPrimaryKey(ClientFormMetadata record);
}