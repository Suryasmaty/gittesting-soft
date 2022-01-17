package com.organization.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.entity.Department;
import com.organization.entity.Employee;
import com.organization.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository repo;
	
	public String saveEmployee(Employee employee) throws Exception
	{
		Department dept = employee.getDepartment();
		List<Employee> emp =repo.findByDepartment(dept.getdId());
		int x= emp.size();//4
		if(x>=dept.getMaxEmp())//x>=4
		{
			throw new Exception("exceeds limit");
		}
		else
		{
			repo.save(employee);
			return "Employee Added Successfully";
		}
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	public List<Employee> getAllEmployeesOfDepartmetByAscendingOrder(long dId)
	{
		return repo.getAllEmployeesOfDepartmetByAscendingOrder(dId);
	}
	
	/*
	 * public List<Employee> findAllEmployee() { return repo.findAll(); }
	 */
	
	/*
	 * public Employee getEmployeeById(long id) { return
	 * repo.findById(id).orElseThrow(()-> new
	 * ResourceNotFoundException("Employee","Id",id));
	 * 
	 * 
	 * }
	 */
	
	
	
	
	
}
