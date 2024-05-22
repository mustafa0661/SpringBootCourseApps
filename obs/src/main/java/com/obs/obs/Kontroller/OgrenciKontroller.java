package com.obs.obs.Kontroller;

import com.obs.obs.DataTransferObject.OgrenciDTO;
import com.obs.obs.Servis.OgrenciServisi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class OgrenciKontroller {

    private OgrenciServisi ogrenciServisi;

    public OgrenciKontroller(OgrenciServisi ogrenciServisi) {
        this.ogrenciServisi = ogrenciServisi;
    }

    @PostMapping("/ogrenciler")
    public String ogrenciyiKaydet(@ModelAttribute("ogrenci") OgrenciDTO ogrenciDTO){
        ogrenciServisi.yeniOgrKaydet(ogrenciDTO);
        return "redirect:/obsGetirHepsi";
    }

    @GetMapping("/yeniogr")
    public String yeniOgrenci(Model model){
        OgrenciDTO ogrenciDTO  = new OgrenciDTO();
        model.addAttribute("ogrenci",ogrenciDTO);
        return "yeniOgrSayfasi";
    }

    @GetMapping("/obsGetirHepsi")
    public String getirButunOgrenciler(Model model){
        List<OgrenciDTO> ogrencilerGetir = ogrenciServisi.getButunOgr();
        model.addAttribute("ogrenciler", ogrencilerGetir);
        return "getirOBSOgrHepsi";
    }
}
