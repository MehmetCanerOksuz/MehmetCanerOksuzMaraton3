package com.caneroksuz.service;

import com.caneroksuz.repository.KisiRepository;
import com.caneroksuz.repository.entity.Kisi;

public class KisiService {

    private KisiRepository kisiRepository;

    public KisiService() {
        this.kisiRepository = new KisiRepository();
    }

    public Kisi kisiOlustur(Kisi kisi) {
        return kisiRepository.kisiOlustur(kisi);
    }

    public Kisi kisiAraById(Long id) {
        return kisiRepository.kisiAraById(id);
    }
}
