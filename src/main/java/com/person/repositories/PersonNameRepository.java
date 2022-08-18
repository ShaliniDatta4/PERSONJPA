package com.person.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.person.entities.PersonName;

@Repository
public interface PersonNameRepository extends JpaRepository<PersonName, Long> {

	List<PersonName> findByFirstName(String firstName);

}
