package com.springBoot.lab7.DTO;

import com.springBoot.lab7.Veri.Ogrenci;

public class OgrenciEsleme {
    public static OgrenciDTO ogrenciDTOEsle(Ogrenci ogrenci) {
        OgrenciDTO ogrenciDTO = new OgrenciDTO(
                ogrenci.getId(),
                ogrenci.getAd(),
                ogrenci.getSoyad()
        );
        return ogrenciDTO;
    }

    public static Ogrenci ogrenciEsle(OgrenciDTO ogrenciDTO) {
        Ogrenci ogr1 = new Ogrenci(
                ogrenciDTO.getId(),
                ogrenciDTO.getAd(),
                ogrenciDTO.getSoyad()
        );
        return ogr1;
    }
}
