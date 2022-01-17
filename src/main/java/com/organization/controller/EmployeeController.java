package com.organization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.organization.entity.Employee;
import com.organization.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{
	@Autowired
	private EmployeeService service;
		
	@PostMapping("/")
	public String saveEmployee(@RequestBody Employee employee) throws Exception
	{
		return service.saveEmployee(employee);
	}
	
	
	@GetMapping("/")
	public List<Employee> findAllEmployee()
	{
		return service.findAll();
	}
	
	@GetMapping("/{dId}")
	public List<Employee> getAllEmployeesOfDepartmetByAscendingOrder(@PathVariable long dId)
	{
		return service.getAllEmployeesOfDepartmetByAscendingOrder(dId);
	}
	
	/*
	 * @GetMapping("{id}") public ResponseEntity<Employee>
	 * getEmployeeById(@PathVariable("id") long id) { return new
	 * ResponseEntity<Employee>(service.getEmployeeById(id),HttpStatus.OK); }
	 */
		
}
