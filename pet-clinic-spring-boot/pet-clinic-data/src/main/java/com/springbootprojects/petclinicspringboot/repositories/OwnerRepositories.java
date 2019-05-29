package com.springbootprojects.petclinicspringboot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springbootprojects.petclinicspringboot.model.Owner;

public interface OwnerRepositories extends CrudRepository<Owner, Long> {

}
