package com.mx.design.patterns.creation.builder;

import java.util.Date;

public class Person {

	private String firstName; //required
	private String surname; //required
	private String dni; //required
	private Date birthDate; //optional
	private String address; //optional
	
	private Person(Builder builder) {
	    this.firstName = builder.firstName;
	    this.surname = builder.surname;
	    this.dni = builder.dni;
	    this.birthDate = builder.birthDate;
	    this.address = builder.address;
	}
	  
	public String getFirstName() {
		return firstName;
	}

	public String getSurname() {
		return surname;
	}

	public String getDni() {
		return dni;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String getAddress() {
		return address;
	}

	public static class Builder {

	    private String firstName;
	    private String surname;
	    private String dni;
	    private Date birthDate;
	    private String address;

	    public Builder(String firstName, String surname, String dni) {
	      this.firstName = firstName;
	      this.surname = surname;
	      this.dni = dni;
	    }

	    public Builder birthDate(Date birthDate) {
	      this.birthDate = birthDate;
	      return this;
	    }

	    public Builder address(String address) {
	      this.address = address;
	      return this;
	    }

	    public Person build() {
	      return new Person(this);
	    }

	}

}