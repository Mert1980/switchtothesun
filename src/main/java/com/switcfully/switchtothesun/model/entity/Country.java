package com.switcfully.switchtothesun.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table
public class Country {

    @Id
    private Long id;

    @Column
    private String name;

    public Country(String name) {
        this.name = name;
    }

}
