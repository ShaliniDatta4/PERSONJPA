package com.person.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import com.person.repositories.PersonRepository;
import com.person.services.PersonAddService;

@AutoConfigureMockMvc
@SpringBootTest
@ActiveProfiles("test")
public class AddPersonControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private AddPersonController addPersonController;

	@MockBean
	private PersonAddService personAddService;

	@MockBean
	private PersonRepository personRepository;

	@WithMockUser(username = "admin2", password = "admin2")
	@Test
	public void addPersonTest() throws Exception {

		mockMvc.perform(post("/addPerson").contentType(MediaType.APPLICATION_JSON_VALUE)
				.accept(MediaType.APPLICATION_JSON_VALUE)
				.content("{\r\n" + "    \"personID\": null,\r\n" + "    \"dateOfBirth\": \"04/23/1993\",\r\n"
						+ "    \"sex\": \"Female\",\r\n" + "    \"race\": \"American\",\r\n"
						+ "    \"personName\": {\r\n" + "        \"personNameID\": null,\r\n"
						+ "        \"firstName\": \"Antony Peter\",\r\n" + "        \"lastName\": \"Datta\",\r\n"
						+ "        \"middleName\": \"Kumari\"\r\n" + "    },\r\n" + "    \"personAddresses\": [\r\n"
						+ "        {\r\n" + "            \"personAddressID\": null,\r\n"
						+ "            \"street1\": \"123\",\r\n" + "            \"street2\": \"GTA\",\r\n"
						+ "            \"city\": \"Kolkata\",\r\n" + "            \"state\": \"WB\",\r\n"
						+ "            \"county\": \"WB\",\r\n" + "            \"zipCode\": \"700014\",\r\n"
						+ "            \"person\": null\r\n" + "        },\r\n" + "        {\r\n"
						+ "            \"personAddressID\": null,\r\n" + "            \"street1\": \"701\",\r\n"
						+ "            \"street2\": \"WAY\",\r\n" + "            \"city\": \"Verona\",\r\n"
						+ "            \"state\": \"WI\",\r\n" + "            \"county\": \"Dane\",\r\n"
						+ "            \"zipCode\": \"53593\",\r\n" + "            \"person\": null\r\n"
						+ "        }\r\n" + "    ],\r\n" + "    \"personEducations\": [\r\n" + "        {\r\n"
						+ "            \"personEducationID\": null,\r\n" + "            \"degree\": \"Btech\",\r\n"
						+ "            \"yearOfGraduation\": 1999\r\n" + "        },\r\n" + "        {\r\n"
						+ "            \"personEducationID\": null,\r\n" + "            \"degree\": \"MBA\",\r\n"
						+ "            \"yearOfGraduation\": 2001\r\n" + "        }\r\n" + "    ]\r\n" + "}"))
				.andExpect(status().is2xxSuccessful());
	}
}
