package com.organization.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.organization.entity.Department;

@Repository
@Transactional
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	@Modifying
	@Query("update Department d set d.maxEmp=?2 where d.dId=?1")
	void alterMaxSize(long dId, int newSize);

	@Query("select d from Department d order by d.dName")
	List<Department> getAllDepartmentsByAscendingOrder();

}
