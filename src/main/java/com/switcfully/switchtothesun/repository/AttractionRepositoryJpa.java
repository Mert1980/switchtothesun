package com.switcfully.switchtothesun.repository;

import com.switcfully.switchtothesun.model.dto.AttractionDto;
import com.switcfully.switchtothesun.service.mapper.AttractionDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AttractionRepositoryJpa {

    @PersistenceContext
    private EntityManager entityManager;

    public List<AttractionDto> getAllAttractions() {
      return null;
    }
}
