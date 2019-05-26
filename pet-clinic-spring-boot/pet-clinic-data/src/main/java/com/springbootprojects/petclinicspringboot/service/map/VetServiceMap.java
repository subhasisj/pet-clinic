package com.springbootprojects.petclinicspringboot.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springbootprojects.petclinicspringboot.model.Speciality;
import com.springbootprojects.petclinicspringboot.model.Vet;
import com.springbootprojects.petclinicspringboot.service.SpecialityService;
import com.springbootprojects.petclinicspringboot.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	private final SpecialityService specialtiyService;

	protected VetServiceMap(SpecialityService specialtiyService) {
		this.specialtiyService = specialtiyService;
	}

@Override
	public Vet save(Vet object) {
		
		if (object.getSpeciality().size() == 0 ) {
			object.getSpeciality().forEach(  speciality -> {
				if ( speciality.getId() == null ) {
					Speciality savedSpeciality = specialtiyService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
		
		return super.save( object);
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
