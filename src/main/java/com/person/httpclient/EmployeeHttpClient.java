package com.person.httpclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.person.model.Employee;

@Component
public class EmployeeHttpClient {

	@Value("${employee.base.url}")
	private String baseEmployeeURL;

	@Autowired
	private RestTemplate restTemplate;

	public Employee doGet(Long id) {

		String finalUrl = baseEmployeeURL + "/getEmployee/" + id;

		ResponseEntity<Employee> response = restTemplate.exchange(finalUrl, HttpMethod.GET, null, Employee.class);
		if (response.getStatusCode().is2xxSuccessful()) {
			return response.getBody();
		} else
			return null;
	}
}
