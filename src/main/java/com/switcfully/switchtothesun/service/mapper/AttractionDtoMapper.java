package com.switcfully.switchtothesun.service.mapper;


import com.switcfully.switchtothesun.model.dto.AttractionDto;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class AttractionDtoMapper implements DtoMapper<ResultSet, AttractionDto> {

    @Override
    public AttractionDto map(ResultSet resultSet) throws SQLException {
        return new AttractionDto(resultSet.getString("attraction_name"), resultSet.getString("country_name"));
    }
}
