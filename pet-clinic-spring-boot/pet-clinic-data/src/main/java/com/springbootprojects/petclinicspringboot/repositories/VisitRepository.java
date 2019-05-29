package com.springbootprojects.petclinicspringboot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springbootprojects.petclinicspringboot.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
