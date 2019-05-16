package com.springbootprojects.petclinicspringboot.service;

import java.util.Set;

import com.springbootprojects.petclinicspringboot.model.Owner;
import com.springbootprojects.petclinicspringboot.model.Pet;
import com.springbootprojects.petclinicspringboot.model.Vet;

public interface VetService extends CrudService<Pet, Long> {

	Vet findByLastName(String lastName);

}