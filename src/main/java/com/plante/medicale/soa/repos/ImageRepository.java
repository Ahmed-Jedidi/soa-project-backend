package com.plante.medicale.soa.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plante.medicale.soa.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
	Optional<Image> findByName(String name);
}
