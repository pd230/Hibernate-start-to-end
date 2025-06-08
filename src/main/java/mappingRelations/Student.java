package mappingRelations;

import java.util.List;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.*;

@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
//	@OneToOne
//	private Laptops laptop1;
	
//	@OneToMany(mappedBy = "student")
//	private List<Laptops> laptop;
	
	@ManyToMany(mappedBy = "student")
	private List<Laptops> laptop;
	
	public List<Laptops> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptops> laptop) {
		this.laptop = laptop;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", laptop=" + laptop + "]";
	}

}
