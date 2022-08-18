package com.person.services;

import org.springframework.stereotype.Service;

import com.person.httpclient.EmployeeHttpClient;
import com.person.model.Employee;

@Service
public class EmployeeDetailsService {

	private EmployeeHttpClient employeeHttpClient;

	/**
	 * @param employeeHttpClient
	 */
	public EmployeeDetailsService(EmployeeHttpClient employeeHttpClient) {
		this.employeeHttpClient = employeeHttpClient;
	}

	public Employee findbyID(Long id) {

		return employeeHttpClient.doGet(id);
	}

}
