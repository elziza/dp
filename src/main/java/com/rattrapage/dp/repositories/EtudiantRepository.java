package com.rattrapage.dp.repositories;

import com.rattrapage.dp.entities.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    Page<Etudiant> findAll(Pageable pageable);
    Etudiant findByMatricule(String matricule);

}
