package com.springCore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student
{
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	Address address;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", address=" + address + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	private void Start()
	{
		System.out.println("This is my init mathod");
	}
	
	@PreDestroy
	private void End()
	{
		System.out.println("This is my destroy mathod");
	}
	
	

}
