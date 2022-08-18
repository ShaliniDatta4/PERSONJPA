package com.person.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "PERSON")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	@Id
	@GeneratedValue(generator = "PERSON_SEQ")
	@SequenceGenerator(name = "PERSON_SEQ", sequenceName = "PERSON_ID_SEQ", allocationSize = 1)
	@Column(name = "PERSON_ID")
	private Long personID;

	@Column(name = "PERSON_DOB")
	private String dateOfBirth;

	@Column(name = "PERSON_SEX")
	private String sex;

	@Column(name = "PERSON_RACE")
	private String race;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSON_NAME_ID")
	private PersonName personName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSON_ID", referencedColumnName = "PERSON_ID")
	private List<PersonAddress> personAddresses;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSON_ID", referencedColumnName = "PERSON_ID")
	private List<PersonEducation> personEducations;

}
