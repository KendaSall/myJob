package com.kenda.myjob.repository;

import com.kenda.myjob.entity.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvRepository extends JpaRepository<Cv, Integer> {
    Cv findByName(String nom);
}
