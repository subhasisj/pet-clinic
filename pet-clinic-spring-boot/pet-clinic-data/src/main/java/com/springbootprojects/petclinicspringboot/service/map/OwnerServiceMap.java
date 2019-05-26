package com.springbootprojects.petclinicspringboot.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springbootprojects.petclinicspringboot.model.Owner;
import com.springbootprojects.petclinicspringboot.model.Pet;
import com.springbootprojects.petclinicspringboot.service.OwnerService;
import com.springbootprojects.petclinicspringboot.service.PetService;
import com.springbootprojects.petclinicspringboot.service.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetTypeService petTypeService;
	private final PetService petService;

	protected OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Owner save(Owner object) {

		  if(object != null){
	            if (object.getPets() != null) {
	                object.getPets().forEach(pet -> {
	                    if (pet.getPetType() != null){
	                        if(pet.getPetType().getId() == null){
	                            pet.setPetType(petTypeService.save(pet.getPetType()));
	                        }
	                    } else {
	                        throw new RuntimeException("Pet Type is required");
	                    }

	                    if(pet.getId() == null){
	                        Pet savedPet = petService.save(pet);
	                        pet.setId(savedPet.getId());
	                    }
	                });
	            }

	            return super.save(object);

	        } else {
	            return null;
	        }
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
