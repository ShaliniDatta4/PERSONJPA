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
@Table(name = "PERSON_NAME")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PersonName {

	@Id
	@GeneratedValue(generator = "PERSON_NAME_SEQ")
	@SequenceGenerator(name = "PERSON_NAME_SEQ", sequenceName = "PERSON_NAME_SEQ", allocationSize = 1)
	@Column(name = "PERSON_NAME_ID")
	private Long personNameID;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

}
