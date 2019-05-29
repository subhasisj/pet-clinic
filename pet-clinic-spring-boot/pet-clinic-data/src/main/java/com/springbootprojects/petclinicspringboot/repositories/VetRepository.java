package com.springbootprojects.petclinicspringboot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springbootprojects.petclinicspringboot.model.Owner;
import com.springbootprojects.petclinicspringboot.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
