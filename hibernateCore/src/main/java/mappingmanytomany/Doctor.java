package mappingmanytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/*import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;*/

@Entity
public class Doctor 
{
	@Id
	private int doctorId;
	
	@Column(nullable=false,length=30)
	private String doctorName;
	
	
	@ManyToMany(mappedBy = "doctors", cascade = CascadeType.ALL)
	private List<Patient> patient;


	public int getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public List<Patient> getPatient() {
		return patient;
	}


	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}


	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", patient=" + patient + "]";
	}


	public Doctor(int doctorId, String doctorName, List<Patient> patient) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.patient = patient;
	}


	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
