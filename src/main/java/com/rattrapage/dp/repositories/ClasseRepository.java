package com.rattrapage.dp.repositories;

import com.rattrapage.dp.entities.Classe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClasseRepository extends JpaRepository<Classe, Long> {
    @Override
    Page<Classe> findAll(Pageable pageable);
}
