package mappingonetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/*import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;*/

@Entity
public class Employee
{
	@Id
	private int employeeId;
	
	@Column(nullable=false,length=30)
	private String employeeName;
	
	@Column(nullable=false,length=30)
	private String employeeContact;
	
	@OneToOne
	private Department department;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeContact() {
		return employeeContact;
	}

	public void setEmployeeContact(String employeeContact) {
		this.employeeContact = employeeContact;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeContact="
				+ employeeContact + ", department=" + department + "]";
	}

	public Employee(int employeeId, String employeeName, String employeeContact, Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeContact = employeeContact;
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
