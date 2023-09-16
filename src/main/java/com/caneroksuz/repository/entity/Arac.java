package com.caneroksuz.repository.entity;

import com.caneroksuz.repository.enums.EArabaStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Arac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "marka")
    private String marka;
    @Column(name = "model")
    private String model;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private EArabaStatus durum = EArabaStatus.MUSAIT;

}
