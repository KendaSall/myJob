package com.kenda.myjob.repository;

import com.kenda.myjob.entity.Categorie;
import com.kenda.myjob.entity.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffreRepository extends JpaRepository<Offre, Integer> {
}
