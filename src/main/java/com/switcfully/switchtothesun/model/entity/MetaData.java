package com.switcfully.switchtothesun.model.entity;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
public class MetaData {

    private static int numberOfVisits;

    public MetaData() {
        this.numberOfVisits++;
    }

    public static int getNumberOfVisits() {
        return numberOfVisits;
    }
}
