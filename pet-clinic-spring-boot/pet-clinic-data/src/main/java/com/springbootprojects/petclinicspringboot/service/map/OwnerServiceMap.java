package com.springbootprojects.petclinicspringboot.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springbootprojects.petclinicspringboot.model.Owner;
import com.springbootprojects.petclinicspringboot.service.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements  OwnerService {

	@Override
	public Owner Save(Owner object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Owner> findAll() {
	
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	Owner save(Long id, Owner object) {
		// TODO Auto-generated method stub
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
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
	public Owner findByLastName(String lastName) {
		return null;
	}
	

}
