package com.springbootprojects.petclinicspringboot.service.map;

import java.util.Set;

import com.springbootprojects.petclinicspringboot.model.Pet;
import com.springbootprojects.petclinicspringboot.service.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Pet Save(Pet object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Pet> findAll() {
	
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	Pet save(Long id, Pet object) {
		// TODO Auto-generated method stub
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode(); 
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
