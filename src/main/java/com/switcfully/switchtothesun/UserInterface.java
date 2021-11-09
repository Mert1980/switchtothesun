package com.switcfully.switchtothesun;

import com.switcfully.switchtothesun.service.CountryService;
import com.switcfully.switchtothesun.service.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class UserInterface {

    private CountryServiceImpl countryService;

    @Autowired
    public UserInterface(CountryServiceImpl countryService) {
        this.countryService = countryService;
    }

    public void run(){
        countryService.getAllCountries().forEach(country -> System.out.println(country));
    }
}
