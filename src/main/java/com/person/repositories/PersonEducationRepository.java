package com.person.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.person.entities.PersonEducation;

@Repository
public interface PersonEducationRepository extends JpaRepository<PersonEducation, Long> {

}
