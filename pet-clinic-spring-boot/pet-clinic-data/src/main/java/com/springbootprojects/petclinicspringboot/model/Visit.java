package com.springbootprojects.petclinicspringboot.model;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.springbootprojects.petclinicspringboot.model.BaseEntity;
import com.springbootprojects.petclinicspringboot.model.Pet;

@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

	private LocalDate date;
	private String description;
	
	@ManyToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "pet_id")
	private Pet pet;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

}
