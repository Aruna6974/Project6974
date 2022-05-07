package mappingmanytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/*import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
*/
@Entity
public class Patient 
{
	@Id
	private int patientId;
	
	@Column(nullable=false,length=30)
	private String patientName; 
	
	@ManyToMany
	private List<Doctor> doctors;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", doctors=" + doctors + "]";
	}

	public Patient(int patientId, String patientName, List<Doctor> doctors) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.doctors = doctors;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
