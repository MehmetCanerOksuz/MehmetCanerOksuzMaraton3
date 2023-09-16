package com.caneroksuz.service;

import com.caneroksuz.repository.KiralamaRepository;
import com.caneroksuz.repository.entity.Arac;
import com.caneroksuz.repository.entity.Kiralama;

import java.util.List;

public class KiralamaService {

    private KiralamaRepository kiralamaRepository;

    public KiralamaService() {

        this.kiralamaRepository = new KiralamaRepository();
    }

    public Kiralama kiralamaOlustur(Kiralama kiralama) {

        return kiralamaRepository.kiralamaOlustur(kiralama);
    }

    public List<Arac> kiralananAraclarByKisiId(Long id) {

        return kiralamaRepository.kiralananAraclarByKisiId(id);
    }
}
