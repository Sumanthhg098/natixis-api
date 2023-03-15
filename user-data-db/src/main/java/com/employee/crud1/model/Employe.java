package com.employee.crud1.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe {
	
	@Id
	int id;
	String name;
	String password;
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}

	
	
	
}
