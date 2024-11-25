package com.joa.springboot.Planta;

import com.joa.springboot.Planta.Planta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantaRepository extends JpaRepository<Planta, Long> {
}