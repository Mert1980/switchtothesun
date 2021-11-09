package com.switcfully.switchtothesun.service;

import com.switcfully.switchtothesun.model.entity.Country;
import com.switcfully.switchtothesun.repository.CountryRepositoryJpa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService<Country, Long, String>{

    private final CountryRepositoryJpa countryRepositoryJpa;

    public CountryServiceImpl(CountryRepositoryJpa countryRepositoryJpa) {
        this.countryRepositoryJpa = countryRepositoryJpa;
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepositoryJpa.getAllCountries();
    }

    @Override
    public Country getById(Long id) {
        return countryRepositoryJpa.getById(id);
    }

    @Override
    public Country getByName(String name) {
        return countryRepositoryJpa.getByName(name);
    }
}
