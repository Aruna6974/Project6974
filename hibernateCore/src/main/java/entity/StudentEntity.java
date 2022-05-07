package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
*/
@Entity
public class StudentEntity 
{
	@Id
	 private int rollno;
	
	@Column(nullable = false,length = 30)
	 private String studentName;
	
	@Column(nullable = false,length = 30)
	 private String address;
	
	@Column(nullable = false,length = 30)
	 private String email;
	
	@Column(nullable = false,length = 30)
	 private String contact;

	@Override
	public String toString() 
	{
		return "StudentEntity [rollno=" + rollno + ", studentName=" + studentName + ", address=" + address + ", email="
				+ email + ", contact=" + contact + "]";
	}

	public int getRollno() 
	{
		return rollno;
	}

	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}

	public String getStudentName()
	{
		return studentName;
	}

	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getContact()
	{
		return contact;
	}

	public void setContact(String contact) 
	{
		this.contact = contact;
	}


	public StudentEntity(int rollno, String studentName, String address, String email, String contact) 
	{
		super();
		this.rollno = rollno;
		this.studentName = studentName;
		this.address = address;
		this.email = email;
		this.contact = contact;
	}

	public StudentEntity() 
	{
		super();
	}


}
