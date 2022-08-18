package com.person.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.person.entities.Person;
import com.person.entities.PersonName;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	List<Person> findByPersonName(PersonName personName);
	

}
