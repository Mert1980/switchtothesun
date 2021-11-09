package com.switcfully.switchtothesun.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ReportRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ReportRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getNumberOfVisits(){
        return jdbcTemplate.query(
                "select number_of_visits from metadata",
                (row, rowNum) -> row.getInt("number_of_visits")
        ).get(0);
    }

    public void updateNumberOfVisits(){
        jdbcTemplate.update(
                "update metadata set " +
                        "number_of_visits = (?) " +
                        "where id = 0",
                getNumberOfVisits() + 1
        );
    }
}
