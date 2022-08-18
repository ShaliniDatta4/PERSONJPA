package com.person.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.person.model.Employee;
import com.person.services.EmployeeDetailsService;

@RestController
public class EmployeeDetailsByID {

	private EmployeeDetailsService employeeDetailsService;

	/**
	 * @param employeeDetailsService
	 */
	public EmployeeDetailsByID(EmployeeDetailsService employeeDetailsService) {
		this.employeeDetailsService = employeeDetailsService;
	}

	@GetMapping(value = "/findEmployee/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeebyID(@PathVariable Long id) {
		return employeeDetailsService.findbyID(id);
	}
}
