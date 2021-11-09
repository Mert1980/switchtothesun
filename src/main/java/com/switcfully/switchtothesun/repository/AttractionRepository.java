package com.switcfully.switchtothesun.repository;

import com.switcfully.switchtothesun.model.dto.AttractionDto;
import com.switcfully.switchtothesun.service.mapper.AttractionDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AttractionRepository {

    private final JdbcTemplate jdbcTemplate;
    private final AttractionDtoMapper attractionDtoMapper;

    @Autowired
    public AttractionRepository(JdbcTemplate jdbcTemplate, AttractionDtoMapper attractionDtoMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.attractionDtoMapper = attractionDtoMapper;
    }

    public List<AttractionDto> getAllAttractions() {
        return jdbcTemplate.query("SELECT attraction.name as attraction_name, country.name as country_name FROM attraction JOIN country ON attraction.fk_country_id = country.id",
                (resultSet, rowNum) -> attractionDtoMapper.map(resultSet));
    }
}
