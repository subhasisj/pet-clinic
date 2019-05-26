package com.springbootprojects.petclinicspringboot.model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person {
	
	private String addess;
	private String city;
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
