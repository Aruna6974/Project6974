package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEntity2
{
	@Id
	private int studentId;
	@Column (nullable=false,length=40)
	private String studentName;
	@Column(nullable=false,length=40)
	private int studentAge;
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
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	@Override
	public String toString() {
		return "StudentEntity2 [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ "]";
	}
	public StudentEntity2(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	public StudentEntity2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
