package com.mx.design.patterns.creation.builder;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		Person person = new Person.Builder("Jonh", "Due", "01234567890")
				.address("unkonw address")
				.birthDate(new Date())
				.build();
		System.out.println(person);
	}

}
