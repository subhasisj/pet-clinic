package com.springbootprojects.petclinicspringboot.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "owners")
public class Owner extends Person {
	
	private String addess;
	private String city;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "owner")
	private Set<Pet> pets = new HashSet<>();
	private String telephone;

	public String getAddess() {
		return addess;
	}

	public String getCity() {
		return city;
	}

	public Set<Pet> getPets() {
		return pets;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setAddess(String addess) {
		this.addess = addess;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
	

}
