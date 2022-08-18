package com.person.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.person.services.PersonDeleteService;

@RestController
public class DeletePersonController {

	private PersonDeleteService personDeleteService;

	public DeletePersonController(PersonDeleteService personDeleteService) {
		this.personDeleteService = personDeleteService;
	}

	@DeleteMapping(value = "/deletepersonById")
	public String deletePersonByIdRequestParam(@RequestParam Long personId) {

		return personDeleteService.deletePersonById(personId);
	}
}
