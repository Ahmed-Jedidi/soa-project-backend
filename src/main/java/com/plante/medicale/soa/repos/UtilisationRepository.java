package com.plante.medicale.soa.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plante.medicale.soa.entities.Utilisation;
import java.util.Optional;

@Repository
public interface UtilisationRepository extends JpaRepository<Utilisation, Long> {
	
	Utilisation findByTitre(String utilisation);
	//OptionalList<Role> findByRole_id(Long role_id);
	//<Role> findById(Long id);
	/*Role findByRole_id(Long role_id);*/
	Optional<Utilisation> findById(Long id);

}
