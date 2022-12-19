package com.plante.medicale.soa.service;

import java.util.List;

import com.plante.medicale.soa.entities.Type;

public interface TypeService {
	Type saveType(Type t);
	Type updateType(Type t);
	void deleteType(Type t);
	void deleteTypeById(Long id);
	Type getType(Long id);
	List<Type> getAllTypes();

}
