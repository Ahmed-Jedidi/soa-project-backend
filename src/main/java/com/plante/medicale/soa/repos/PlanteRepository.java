package com.plante.medicale.soa.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plante.medicale.soa.entities.Plante;

@Repository
public interface PlanteRepository extends JpaRepository<Plante, Long> {

}
