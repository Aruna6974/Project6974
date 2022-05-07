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
public class Department 
{
	@Id
	private int departmentId;
	
	
    @Column(nullable=false,length=30)
	private String departmentName;
    
    @OneToOne(mappedBy="department")
    private Employee employee;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employee="
				+ employee + "]";
	}

	public Department(int departmentId, String departmentName, Employee employee) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employee = employee;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
