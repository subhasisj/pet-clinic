package com.springbootprojects.petclinicspringboot.model;

public class Person extends BaseEntity {

	private Long id;
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public Long getId() {
		return id;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
