package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeFile 
{
	@Id
	private int empId;
	@Column(nullable=false,length=40)
	private String empName;
	@Column(nullable=false,length=40)
	private String empAddress;
	@Column(nullable=false,length=40)
	private String empPosition;
	@Column(nullable=false,length=40)
	private int empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empPosition="
				+ empPosition + ", empSalary=" + empSalary + "]";
	}
	public EmployeeFile(int empId, String empName, String empAddress, String empPosition, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empPosition = empPosition;
		this.empSalary = empSalary;
	}
	public EmployeeFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
