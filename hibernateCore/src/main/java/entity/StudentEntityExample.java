package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEntityExample 
{
	@Id
	private int studentId;
	
	@Column(nullable=false,length=40)
	private String studentName;
	
	@Column(nullable=false)
	private int studentage;

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

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	@Override
	public String toString() {
		return "StudentEntityExample [studentId=" + studentId + ", studentName=" + studentName + ", studentage="
				+ studentage + "]";
	}

	public StudentEntityExample(int studentId, String studentName, int studentage) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentage = studentage;
	}

	public StudentEntityExample() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
