package com.springbootprojects.petclinicspringboot.service;

import java.util.Set;

import com.springbootprojects.petclinicspringboot.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName( String lastName  );
	
}
