package com.organization.entity;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Employee 
{
	@Id
	private int eId;
	private String name;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="department_Id", referencedColumnName="dId")
	@JsonBackReference
	@Embedded
	private Department department;
	
	public Employee() {
		super();
	}
	

	public Employee(int eId, String name, Department department) {
		super();
		this.eId = eId;
		this.name = name;
		this.department = department;
	}


	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", department=" + department + "]";
	}
	
	
	
}
