package com.plante.medicale.soa.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plante.medicale.soa.entities.Type;
@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {
	Type findByNomType(String nomType);

}
