package com.plante.medicale.soa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plante.medicale.soa.entities.Fleur;
import com.plante.medicale.soa.repos.FleurRepository;

@Service
public class FleurServiceImpl implements FleurService {
	@Autowired
	FleurRepository fleurRepository;

	@Override
	public Fleur saveFleur(Fleur s) {
		// TODO Auto-generated method stub
		return fleurRepository.save(s);
	}

	@Override
	public Fleur updateFleur(Fleur s) {
		// TODO Auto-generated method stub
		return fleurRepository.save(s);
	}

	@Override
	public void deleteFleur(Fleur s) {
		// TODO Auto-generated method stub
		fleurRepository.delete(s);
	}

	@Override
	public void deleteFleurById(Long id) {
		// TODO Auto-generated method stub
		fleurRepository.deleteById(id);
	}

	@Override
	public Fleur getFleur(Long id) {
		// TODO Auto-generated method stub
		return fleurRepository.findById(id).get();
	}

	@Override
	public List<Fleur> getAllFleurs() {
		// TODO Auto-generated method stub
		return fleurRepository.findAll();
	}

}
