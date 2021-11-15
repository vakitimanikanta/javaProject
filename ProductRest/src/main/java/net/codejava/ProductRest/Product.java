package net.codejava.ProductRest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	private int id;
	private String pan;
	private double aadhar;
	
	public Product() {
		
	}
	
	
	
	
	public Product(int id, String pan, float aadhar) {
		super();
		this.id = id;
		this.pan = pan;
		this.aadhar = aadhar;
	}




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getPan() {
		return pan;
	}


	public void setPan(String pan) {
		this.pan = pan;
	}


	public double getAadhar() {
		return aadhar;
	}


	public void setAadhar(float aadhar) {
		this.aadhar = aadhar;
	}
	
		

}
