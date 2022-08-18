package com.person.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.entities.Person;
import com.person.repositories.PersonRepository;

@Service
public class PersonAddService {

	@Autowired
	private PersonRepository personRepository;


	public Person addNewPerson(Person newPerson) {
		
		return personRepository.save(newPerson);
	}

}
