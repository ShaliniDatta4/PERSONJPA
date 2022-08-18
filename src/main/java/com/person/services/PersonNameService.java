package com.person.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.person.entities.Person;
import com.person.entities.PersonName;
import com.person.repositories.PersonNameRepository;

@Service
public class PersonNameService {

	private PersonNameRepository personNameRepository;
	private PersonService personService;

	public PersonNameService(PersonNameRepository personNameRepository, PersonService personService) {
		this.personNameRepository = personNameRepository;
		this.personService = personService;
	}

	public List<Person> findByFirstName(String firstName) {

		List<PersonName> personNames = null;

		personNames = personNameRepository.findByFirstName(firstName);

		return personService.findPersonByNameId(personNames);
	}

}
