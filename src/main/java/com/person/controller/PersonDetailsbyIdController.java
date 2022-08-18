package com.person.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.person.entities.Person;
import com.person.services.PersonService;

@RestController
public class PersonDetailsbyIdController {

	private PersonService personService;

	public PersonDetailsbyIdController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping(value = "/findPerson/{id}")
	public Optional<Person> findPersonDetailsByIdPathVariable(@PathVariable("id") Long personID) {
		return personService.findPersonById(personID);

	}

	@GetMapping(value = "/findPerson")
	public Optional<Person> findPersonDetailsByIdRequestParam(@RequestParam("id") Long personID) {
		return personService.findPersonById(personID);

	}
}