package com.organization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.entity.Department;
import com.organization.entity.Employee;
import com.organization.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController 
{

	@Autowired
	private DepartmentService service;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department)
	{
		return service.saveDepartment(department);
	}
	
	@GetMapping("/")
	public List<Department> findAllDeparments()
	{
		return service.findAllDepartments();
	}
	
	@GetMapping("/allDepartments")
	public List<Department> getAllEmployeesOfDepartmetByAscendingOrder()
	{
		return service.getAllDepartmentsByAscendingOrder();
	}
	
	@PutMapping("/{dId}/{newSize}")
	public String alterMaxEmployee(@PathVariable long dId,@PathVariable int newSize)
	{
		return service.alterMaxEmployee(dId, newSize);
	}
	
	/*
	 * @GetMapping("{id}") public ResponseEntity<Department>
	 * getDepartmentById(@PathVariable("id") long id) { return new
	 * ResponseEntity<Department>(service.getDepartmentById(id),HttpStatus.OK); }
	 */
}
