package com.Collection;

import java.util.*;

public class Employee
{
	private int employeeId;
	 
	private List<String> employeeNames;
	
	private Set<String> employeeContacts;
	
	private Map<String,Integer> employeePhones;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public List<String> getEmployeeNames() {
		return employeeNames;
	}

	public void setEmployeeNames(List<String> employeeNames) {
		this.employeeNames = employeeNames;
	}

	public Set<String> getEmployeeContacts() {
		return employeeContacts;
	}

	public void setEmployeeContacts(Set<String> employeeContacts) {
		this.employeeContacts = employeeContacts;
	}

	public Map<String, Integer> getEmployeePhones() {
		return employeePhones;
	}

	public void setEmployeePhones(Map<String, Integer> employeePhones) {
		this.employeePhones = employeePhones;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeNames=" + employeeNames + ", employeeContacts="
				+ employeeContacts + ", employeePhones=" + employeePhones + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	

}
