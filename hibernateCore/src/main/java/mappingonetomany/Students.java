package mappingonetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/*import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
*/
@Entity
public class Students 
{
	@Id
	private int studentId;
	
	@Column(nullable=false,length=30)
	private String studentName;
	
	@ManyToOne
	private Faculty faculty;

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

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentName=" + studentName + ", faculty=" + faculty + "]";
	}

	public Students(int studentId, String studentName, Faculty faculty) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.faculty = faculty;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
