package com.obs.obs.Servis;

import com.obs.obs.DataTransferObject.OgrenciDTO;
import com.obs.obs.Eslesme.Esleme;
import com.obs.obs.Repo.OgrenciRepo;
import com.obs.obs.Veri.Ogrenci;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OgrenciServisUyg implements OgrenciServisi{

    private OgrenciRepo ogrenciRepo;

    @Autowired
    public OgrenciServisUyg(OgrenciRepo ogrenciRepo){
        this.ogrenciRepo = ogrenciRepo;
    }

    @Override
    public List<OgrenciDTO> getButunOgr() {
        List<Ogrenci> ogrenciListesi = ogrenciRepo.findAll();
        List<OgrenciDTO> ogrenciDTOListesi = ogrenciListesi.stream()
                .map((ogrenci) -> Esleme.ogrenciDTOesle(ogrenci))
                .collect(Collectors.toList());
        return ogrenciDTOListesi;
    }

    @Override
    public void yeniOgrKaydet(OgrenciDTO ogrenciDTO) {
        Ogrenci ogrenci = Esleme.ogrenciEsle(ogrenciDTO);
        ogrenciRepo.save(ogrenci);
    }
}
