package com.switcfully.switchtothesun.repository;

import com.switcfully.switchtothesun.model.entity.Country;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CountryRepositoryJpa {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Country> getAllCountries(){
       return entityManager.createQuery("select c from Country c", Country.class)
               .getResultList();
    }

    public Country getById(Long id){
        return entityManager.find(Country.class, id);
    }

    public Country getByName(String countryName){
        return entityManager.createQuery("select c from Country c where c.name = :countryName", Country.class)
                .setParameter("countryName", countryName)
                .getSingleResult();
    }

}
