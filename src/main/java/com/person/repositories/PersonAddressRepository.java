package com.person.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.person.entities.PersonAddress;

@Repository
public interface PersonAddressRepository extends JpaRepository<PersonAddress, Long> {

}
