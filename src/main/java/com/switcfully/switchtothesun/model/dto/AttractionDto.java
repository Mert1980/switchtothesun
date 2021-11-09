package com.switcfully.switchtothesun.model.dto;

public class AttractionDto {
    private final String attractionName;
    private final String countryName;

    public AttractionDto(String attractionName, String countryName) {
        this.attractionName = attractionName;
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "AttractionDto{" +
                "attractionName='" + attractionName + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
