package com.springBoot.lab7.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OgrenciDTO {

    private Long id;
    private String ad;
    private String soyad;

}
