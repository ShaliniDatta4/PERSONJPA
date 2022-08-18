package com.person.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "PERSON_ADDRESS")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PersonAddress {

	@Id
	@GeneratedValue(generator = "PERSON_ADDRESS_SEQ")
	@SequenceGenerator(name = "PERSON_ADDRESS_SEQ", sequenceName = "PERSON_ADD_SEQ", allocationSize = 1)
	@Column(name = "PERSON_ADDRESS_ID")
	private long personAddressID;

	@Column(name = "STREET1")
	private String street1;

	@Column(name = "STREET2")
	private String street2;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE")
	private String state;

	@Column(name = "COUNTY")
	private String county;

	@Column(name = "ZIPCODE")
	private String zipCode;

}
