package com.plante.medicale.soa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plante.medicale.soa.entities.Type;
import com.plante.medicale.soa.entities.Utilisation;
import com.plante.medicale.soa.repos.UtilisationRepository;

@Service
public class UtilisationServiceImpl implements UtilisationService{
	
	@Autowired
	private UtilisationRepository utilisationRepository;

	@Override
	public Utilisation findByTitre(String utilisation) {
		return utilisationRepository.findByTitre(utilisation);
	}

	@Override
	public Utilisation saveUtilisation(Utilisation u) {
		// TODO Auto-generated method stub
		return utilisationRepository.save(u);
	}

	@Override
	public Utilisation updateUtilisation(Utilisation u) {
		// TODO Auto-generated method stub
		return utilisationRepository.save(u);
	}

	@Override
	public void deleteUtilisation(Utilisation u) {
		// TODO Auto-generated method stub
		utilisationRepository.delete(u);
	}

	@Override
	public void deleteUtilisationById(Long id) {
		// TODO Auto-generated method stub
		utilisationRepository.deleteById(id);
	}

	@Override
	public Utilisation getUtilisation(Long id) {
		// TODO Auto-generated method stub
		return utilisationRepository.findById(id).get();
	}

	@Override
	public List<Utilisation> getAllUtilisations() {
		// TODO Auto-generated method stub
		return utilisationRepository.findAll();
	}





}
