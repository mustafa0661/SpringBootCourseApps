package com.obs.obs.Servis;

import com.obs.obs.DataTransferObject.OgrenciDTO;

import java.util.List;

public interface OgrenciServisi {

    List<OgrenciDTO> getButunOgr();

    void yeniOgrKaydet(OgrenciDTO ogrenciDTO);
}
