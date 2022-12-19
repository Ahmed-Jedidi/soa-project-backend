package com.plante.medicale.soa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plante.medicale.soa.entities.Type;
import com.plante.medicale.soa.repos.FleurRepository;
import com.plante.medicale.soa.repos.TypeRepository;

@Service
public class TypeServiceImpl implements TypeService {
	@Autowired
	TypeRepository typeRepository;

	@Override
	public Type saveType(Type t) {
		// TODO Auto-generated method stub
		return typeRepository.save(t);
	}

	@Override
	public Type updateType(Type t) {
		// TODO Auto-generated method stub
		return typeRepository.save(t);
	}

	@Override
	public void deleteType(Type t) {
		// TODO Auto-generated method stub
		typeRepository.delete(t);
	}

	@Override
	public void deleteTypeById(Long id) {
		// TODO Auto-generated method stub
		typeRepository.deleteById(id);
	}

	@Override
	public Type getType(Long id) {
		// TODO Auto-generated method stub
		return typeRepository.findById(id).get();
	}

	@Override
	public List<Type> getAllTypes() {
		// TODO Auto-generated method stub
		return typeRepository.findAll();
	}

}
