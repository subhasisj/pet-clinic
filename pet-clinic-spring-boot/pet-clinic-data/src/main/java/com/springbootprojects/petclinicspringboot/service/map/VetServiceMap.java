package com.springbootprojects.petclinicspringboot.service;

import java.util.Set;

import com.springbootprojects.petclinicspringboot.model.Vet;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Vet Save(Vet object) {
		return null;
	}

	@Override
	public Set<Vet> findAll() {
	
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	Vet save(Long id, Vet object) {
		// TODO Auto-generated method stub
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
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

	@Override
	public Vet findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
