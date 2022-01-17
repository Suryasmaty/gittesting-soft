package com.organization.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Embeddable
public class Department 
{
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long dId;
	
	private String dName;
	private int maxEmp;
	
	@OneToMany(mappedBy="department")
	@JsonManagedReference
	private List<Employee> employee;

	public Department() {
		super();
	}

	public Department(long dId, String dName, int maxEmp, List<Employee> employee) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.maxEmp = maxEmp;
		this.employee = employee;
	}

	public long getdId() {
		return dId;
	}

	public void setdId(long dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getMaxEmp() {
		return maxEmp;
	}

	public void setMaxEmp(int maxEmp) {
		this.maxEmp = maxEmp;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", maxEmp=" + maxEmp + ", employee=" + employee + "]";
	}

	
	
	
	
	
	

	

	
			
}
