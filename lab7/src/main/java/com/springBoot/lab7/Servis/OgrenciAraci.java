package com.springBoot.lab7.Servis;

import com.springBoot.lab7.DTO.OgrenciDTO;

import java.util.List;

public interface OgrenciAraci {
    OgrenciDTO yeniOgrenci(OgrenciDTO ogrenci);

    OgrenciDTO getirOgrenci(Long ogrenciId);

    List<OgrenciDTO> getirOgrenciler();

    OgrenciDTO guncelleOgrenci(OgrenciDTO ogrenci);

    void silOgrenci(Long ogrenciId);
}
