package hqlDemo;

import jakarta.persistence.*;

@Entity
public class Hql_Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String sname;
	private int quantity;
	
	public int getId() {
		return id;
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Hql_Product [id=" + id + ", sname=" + sname + ", quantity=" + quantity + "]";
	}
	
	
	
}
