package com.person.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.person.entities.Person;
import com.person.services.PersonAddService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class AddPersonController {

	private PersonAddService personAddService;

	public AddPersonController(PersonAddService personAddService) {
		this.personAddService = personAddService;
	}

	@PostMapping(value = "/addPerson", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Person addPerson(@RequestBody Person newPerson) {
		log.info("Received a request for adding a new person with person name : "
				+ newPerson.getPersonName().getFirstName());
		log.debug("NEW Person Details : " + newPerson.toString());
		return personAddService.addNewPerson(newPerson);
	}

}
