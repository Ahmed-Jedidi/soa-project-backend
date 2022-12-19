package com.plante.medicale.soa.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plante.medicale.soa.entities.Fleur;

@Repository
public interface FleurRepository extends JpaRepository<Fleur, Long> {

}
