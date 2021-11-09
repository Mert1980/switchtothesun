package com.switcfully.switchtothesun.service;

import java.util.List;

public interface CountryService<E, T, U> {
    List<E> getAllCountries();
    E getById(T id);
    E getByName(U name);
}
