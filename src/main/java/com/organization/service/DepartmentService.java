package com.organization.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.entity.Department;
import com.organization.entity.Employee;
import com.organization.repository.DepartmentRepository;

@Service
public class DepartmentService 
{

	@Autowired
	private DepartmentRepository repo;
	
	public Department saveDepartment(Department department)
	{
		return repo.save(department);
	}
	
	public List<Department> findAllDepartments()
	{
		return repo.findAll();
	}
	
	public List<Department> getAllDepartmentsByAscendingOrder()
	{
		return repo.getAllDepartmentsByAscendingOrder();
	}
	
	public String alterMaxEmployee(long dId, int newSize)
	{
		repo.alterMaxSize(dId,newSize);
		return "updated";
	}
	/*
	 * public Department getDepartmentById(long id) { return
	 * repo.findById(id).orElseThrow(()-> new
	 * ResourceNotFoundException("Employee","Id",id));
	 * 
	 * }
	 */
	
	
	
}
