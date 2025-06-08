package model;

import org.hibernate.annotations.*;

import jakarta.persistence.*;


@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class StudentData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Long Id;
	protected String fullname;
	protected String email;
	@Column(name = "uname", unique = true, nullable = false)
	protected String uname;
	@Column(name = "password", unique = true, nullable = false)
	protected String password;
	public Long getId() {
		return Id;
	}
	
	public String getFullName() {
		return fullname;
	}
	public void setFullName(String fullname) {
		this.fullname = fullname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "StudentData [Id=" + Id + ", full name=" + fullname + ", email=" + email + ", uname="
				+ uname + ", password=" + password + "]";
	}
	
}
