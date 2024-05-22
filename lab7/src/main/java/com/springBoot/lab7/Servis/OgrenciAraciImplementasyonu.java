package com.springBoot.lab7.Servis;

import com.springBoot.lab7.DTO.OgrenciDTO;
import com.springBoot.lab7.DTO.OgrenciEsleme;
import com.springBoot.lab7.Repository.OgrenciRepo;
import com.springBoot.lab7.Veri.Ogrenci;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OgrenciAraciImplementasyonu implements OgrenciAraci {

    private OgrenciRepo ogrenciRepo;

    public OgrenciDTO yeniOgrenci(OgrenciDTO ogrenciDTO) {
        Ogrenci ogr = OgrenciEsleme.ogrenciEsle(ogrenciDTO);
        Ogrenci yeniKayit = ogrenciRepo.save(ogr);
        OgrenciDTO yeniKayitDTO = OgrenciEsleme.ogrenciDTOEsle(yeniKayit);
        return yeniKayitDTO;
    }

    @Override
    public OgrenciDTO getirOgrenci(Long ogrenciId) {
        Optional<Ogrenci> ogrenciGet = ogrenciRepo.findById(ogrenciId);
        Ogrenci ogrenci = ogrenciGet.get();
        return OgrenciEsleme.ogrenciDTOEsle(ogrenci);
    }

    @Override
    public List<OgrenciDTO> getirOgrenciler() {
        List<Ogrenci> ogrenci = ogrenciRepo.findAll();
        return ogrenci.stream().map(OgrenciEsleme::ogrenciDTOEsle).collect(Collectors.toList());
    }

    @Override
    public OgrenciDTO guncelleOgrenci(OgrenciDTO ogrenci) {
        Ogrenci guncelle = ogrenciRepo.findById(ogrenci.getId()).get();
        guncelle.setAd(ogrenci.getAd());
        guncelle.setSoyad(ogrenci.getSoyad());
        Ogrenci ogrGuncelle = ogrenciRepo.save(guncelle);
        return OgrenciEsleme.ogrenciDTOEsle(ogrGuncelle);
    }

    @Override
    public void silOgrenci(Long ogrenciId) {
        ogrenciRepo.deleteById(ogrenciId);
    }

}
