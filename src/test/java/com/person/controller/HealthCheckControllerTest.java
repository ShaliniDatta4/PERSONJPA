package com.person.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
@ActiveProfiles("test")
public class HealthCheckControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void checkHealthTest() throws Exception {
		
		mockMvc.perform(get("/health")).andExpect(status().is2xxSuccessful());
		
	}

}
