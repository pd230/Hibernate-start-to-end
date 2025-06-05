package embeddable;

import jakarta.persistence.*;

@Entity
public class EbdDemo1_Alien {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private EbdDemo2_FullName  ef;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EbdDemo2_FullName getEf() {
		return ef;
	}
	public void setEf(EbdDemo2_FullName ef) {
		this.ef = ef;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EbdDemo1_Alien [id=" + id + ", ef=" + ef + ", age=" + age + "]";
	}
	
}
