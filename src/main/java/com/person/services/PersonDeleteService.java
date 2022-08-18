package com.person.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.entities.Person;
import com.person.repositories.PersonRepository;

@Service
public class PersonDeleteService {

	@Autowired
	private PersonRepository personRepository;

	public String deletePersonById(Long personId) {

		Optional<Person> existingPerson = personRepository.findById(personId);

		if (existingPerson.isPresent()) {

			personRepository.deleteById(personId);
			return "Person with PersonID: " + personId + " has been deleted";

		} else {
			return "Not found";
		}

	}

}
