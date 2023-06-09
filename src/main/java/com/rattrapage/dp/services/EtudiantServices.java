package com.rattrapage.dp.services;

import com.rattrapage.dp.repositories.ClasseRepository;
import com.rattrapage.dp.repositories.EtudiantRepository;

public class EtudiantServices {
    private ClasseRepository classeRepository;
    private EtudiantRepository etudiantRepository;

    public EtudiantServices(ClasseRepository classeRepository, EtudiantRepository etudiantRepository) {
        this.classeRepository = classeRepository;
        this.etudiantRepository = etudiantRepository;
    }
}
