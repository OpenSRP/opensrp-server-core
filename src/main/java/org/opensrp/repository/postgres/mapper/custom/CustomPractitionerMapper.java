package org.opensrp.repository.postgres.mapper.custom;

import org.apache.ibatis.annotations.Param;
import org.opensrp.domain.postgres.Practitioner;
import org.opensrp.domain.postgres.PractitionerExample;
import org.opensrp.repository.postgres.mapper.PractitionerMapper;

import java.util.List;

public interface CustomPractitionerMapper extends PractitionerMapper {
    List<Practitioner> selectMany(@Param("example") PractitionerExample practitionerExample,
                                 @Param("offset") int offset, @Param("limit") int limit);
}
