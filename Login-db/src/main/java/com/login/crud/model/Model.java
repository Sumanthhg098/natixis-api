package com.login.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Model {
	
//    @GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;
 
    private String employeename;
 
    private String email;
 
    private String password;

	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Model(int employeeid, String employeename, String email, String password) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.email = email;
		this.password = password;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Model [employeeid=" + employeeid + ", employeename=" + employeename + ", email=" + email + ", password="
				+ password + "]";
	}
	
    
	
}
