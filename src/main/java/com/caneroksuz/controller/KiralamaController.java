package com.caneroksuz.controller;

import com.caneroksuz.repository.entity.Arac;
import com.caneroksuz.repository.entity.Kiralama;
import com.caneroksuz.service.KiralamaService;

import java.util.List;

public class KiralamaController {

    private KiralamaService kiralamaService;

    public KiralamaController() {

        this.kiralamaService = new KiralamaService();
    }


    public Kiralama kiralamaOlustur(Kiralama kiralama) {

        return kiralamaService.kiralamaOlustur(kiralama);
    }

    public List<Arac> kiralananAraclarByKisiId(Long id) {
        return kiralamaService.kiralananAraclarByKisiId(id);
    }
}
