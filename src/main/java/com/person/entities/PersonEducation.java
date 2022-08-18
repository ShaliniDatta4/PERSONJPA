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
@Table(name = "PERSON_EDUCATION")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PersonEducation {

	@Id
	@GeneratedValue(generator = "PERSON_EDU_SEQ")
	@SequenceGenerator(name = "PERSON_EDU_SEQ", sequenceName = "PERSON_EDU_SEQ", allocationSize = 1)
	@Column(name = "PERSON_EDU_ID")
	private long personEducationID;

	@Column(name = "DEGREE")
	private String degree;

	@Column(name = "YEAR_OF_GRADUATION")
	private int yearOfGraduation;

}
