package com.switcfully.switchtothesun;

import com.switcfully.switchtothesun.service.CountryServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwitchtothesunApplication implements CommandLineRunner {

    private final CountryServiceImpl countryService;

    public SwitchtothesunApplication(CountryServiceImpl countryService) {
        this.countryService = countryService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SwitchtothesunApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        countryService.getAllCountries().forEach(country -> System.out.println(country));
    }
}
