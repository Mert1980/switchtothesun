package com.switcfully.switchtothesun.model.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString
public class Attraction {
    private String name;

    public Attraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
