package com.switcfully.switchtothesun.model.entity;

import lombok.*;

import javax.persistence.*;

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

    @OneToOne
    @JoinColumn(name="fk_continent_id")
    private Continent continent;

    public Country(String name) {
        this.name = name;
    }

}
