package mappingRelations;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Laptops {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lid;
	private String lname;
	
//	@ManyToOne
//	private Student student ; 
	
	@ManyToMany
	private List<Student> student ;
	
	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public int getLid() {
		return lid;
	}
	
	public String getLname(){
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}

	public String toString() {
		return "Laptops[laptop id : "+this.lid+ " , laptop name : " +this.lname +"]";
	}
}
