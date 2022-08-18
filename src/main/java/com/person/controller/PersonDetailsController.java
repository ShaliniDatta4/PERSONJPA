package com.person.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.person.entities.Person;
import com.person.services.PersonNameService;

@RestController
public class PersonDetailsController {

	private PersonNameService personNameService;

	public PersonDetailsController(PersonNameService personNameService) {
		this.personNameService = personNameService;
	}

	@GetMapping(value = "/findByFirstName/{firstName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findByFirstName(@PathVariable("firstName") String firstName) {
		return personNameService.findByFirstName(firstName);
	}

}
