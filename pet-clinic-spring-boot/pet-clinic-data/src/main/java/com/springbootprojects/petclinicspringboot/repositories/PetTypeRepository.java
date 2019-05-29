package com.springbootprojects.petclinicspringboot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springbootprojects.petclinicspringboot.model.Owner;
import com.springbootprojects.petclinicspringboot.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType , Long> {

}
