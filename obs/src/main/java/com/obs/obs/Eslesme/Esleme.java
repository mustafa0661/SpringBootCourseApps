package com.obs.obs.Eslesme;

import com.obs.obs.DataTransferObject.OgrenciDTO;
import com.obs.obs.Veri.Ogrenci;

public class Esleme {

    public static OgrenciDTO ogrenciDTOesle(Ogrenci ogrenci) {
        OgrenciDTO ogrenciDTO = new OgrenciDTO(
                ogrenci.getNum(),
                ogrenci.getAd(),
                ogrenci.getYas(),
                ogrenci.getSoyad()
        );
        return ogrenciDTO;
    }

    public static Ogrenci ogrenciEsle(OgrenciDTO ogrenciDTO) {
        Ogrenci ogr1 = new Ogrenci(
                ogrenciDTO.getNum(),
                ogrenciDTO.getAd(),
                ogrenciDTO.getYas(),
                ogrenciDTO.getSoyad()
        );
        return ogr1;
    }
}
