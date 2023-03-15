package com.pipe.crud.model;

import java.util.Date;

public class Employe {
	private int empId;
	private String empName;
	private String empDOB;
	private int empSalary;
	private Date joinDate;
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employe(int empId, String empName, String empDOB, int empSalary, Date joinDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDOB = empDOB;
		this.empSalary = empSalary;
		this.joinDate = joinDate;
	}
	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + ", empDOB=" + empDOB + ", empSalary=" + empSalary
				+ ", joinDate=" + joinDate + "]";
	}
	
	
	
}
