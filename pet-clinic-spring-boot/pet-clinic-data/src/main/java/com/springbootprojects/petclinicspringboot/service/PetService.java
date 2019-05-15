package com.springbootprojects.petclinicspringboot.service;

import java.util.Set;

import com.springbootprojects.petclinicspringboot.model.Owner;
import com.springbootprojects.petclinicspringboot.model.Pet;

public interface PetService {

	Pet findById( Long id);
	
	Pet save( Pet pet );
	
	Set<Pet> findAll();
}
