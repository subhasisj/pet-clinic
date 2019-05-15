package com.springbootprojects.petclinicspringboot.service;

import java.util.Set;

import com.springbootprojects.petclinicspringboot.model.Owner;

public interface OwnerService {

	Owner findById( Long id);
	
	Owner findByLastName( String lastName  );
	
	Owner save( Owner owner );
	
	Set<Owner> findAll();
}
