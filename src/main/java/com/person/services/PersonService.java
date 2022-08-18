package com.person.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.person.entities.Person;
import com.person.entities.PersonName;
import com.person.repositories.PersonRepository;

@Service
public class PersonService {

	private PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public Optional<Person> findPersonById(Long personID) {

		return personRepository.findById(personID);
	}

	public List<Person> findPersonByNameId(List<PersonName> personNames) {

		List<Person> personsFound = new ArrayList<>();

		if (personNames != null & !personNames.isEmpty()) {
			for (PersonName name : personNames) {
				personsFound.addAll(personRepository.findByPersonName(name));
			}
			return personsFound;
		} else {
			return null;
		}

	}

}
