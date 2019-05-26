package com.springbootprojects.petclinicspringboot.service;

import org.springframework.stereotype.Component;

import com.springbootprojects.petclinicspringboot.model.PetType;

@Component
public interface PetTypeService extends CrudService<PetType, Long> {

}
