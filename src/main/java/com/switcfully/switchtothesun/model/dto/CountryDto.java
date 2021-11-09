package com.switcfully.switchtothesun.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CountryDto {

    private Long id;
    private String name;
    private String continent;
}
