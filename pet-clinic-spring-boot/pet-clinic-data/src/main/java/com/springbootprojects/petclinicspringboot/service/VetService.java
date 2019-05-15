package com.springbootprojects.petclinicspringboot.service;

import java.util.Set;

import com.springbootprojects.petclinicspringboot.model.Owner;
import com.springbootprojects.petclinicspringboot.model.Pet;
import com.springbootprojects.petclinicspringboot.model.Vet;

public interface VetService {

	Vet findById( Long id);
	
	Vet findByLastName ( String lastName );
	
	Vet save( Pet pet );
	
	Set<Vet> findAll();
}
