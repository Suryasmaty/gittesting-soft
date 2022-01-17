package com.organization.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.organization.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("From Employee e JOIN e.department d where d.dId=?1")
	//@Query("select e from Employee e where e.department.dId=?1")
	List<Employee> findByDepartment(long getdId);

	@Query("select e FROM Employee e JOIN e.department d where d.dId=?1 order by e.name")
	List<Employee> getAllEmployeesOfDepartmetByAscendingOrder(long dId);
	
	

}
