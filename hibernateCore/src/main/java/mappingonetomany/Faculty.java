package mappingonetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/*import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
*/
@Entity
public class Faculty
{
	@Id
	private int facultyId;
	
	@Column(nullable=false,length=30)
	private String facultyName;
	
	@OneToMany
	private List<Students> students;

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", students=" + students + "]";
	}

	public Faculty(int facultyId, String facultyName, List<Students> students) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.students = students;
	}

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
