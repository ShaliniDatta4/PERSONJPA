package com.person.repositories;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.person.entities.Person;
import com.person.entities.PersonAddress;
import com.person.entities.PersonEducation;
import com.person.entities.PersonName;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest
@ActiveProfiles("test")
public class PersonRepositoryTest {

	@Autowired
	private PersonRepository personRepository;

	@Test
	public void savePerson() {

		PersonName personName = new PersonName();
		personName.setFirstName("Kaustav");
		personName.setLastName("Dutta");
		personName.setMiddleName("Kumar");

		List<PersonAddress> personAddresses = new ArrayList<>();
		PersonAddress address1 = new PersonAddress();
		address1.setCity("Verona");
		address1.setZipCode("53593");
		address1.setState("Wisconsin");
		address1.setStreet1("704 Westminster Way");
		address1.setStreet2("House");

		PersonAddress address2 = new PersonAddress();
		address2.setCity("Verona");
		address2.setZipCode("53593");
		address2.setState("Wisconsin");
		address2.setStreet1("705 Westminster Way");
		address2.setStreet2("House");

		personAddresses.add(address1);
		personAddresses.add(address2);

		List<PersonEducation> personEducations = new ArrayList<>();
		PersonEducation personEducation1 = new PersonEducation();
		personEducation1.setDegree("Btech");
		personEducation1.setYearOfGraduation(2015);

		PersonEducation personEducation2 = new PersonEducation();
		personEducation1.setDegree("MBA");
		personEducation1.setYearOfGraduation(2017);

		personEducations.add(personEducation1);
		personEducations.add(personEducation2);

		Person person = new Person();
		person.setDateOfBirth("08/14/1991");
		person.setRace("Asian");
		person.setSex("Male");
		person.setPersonName(personName);
		person.setPersonAddresses(personAddresses);
		person.setPersonEducations(personEducations);
		
		
		personRepository.save(person);

	}

}
