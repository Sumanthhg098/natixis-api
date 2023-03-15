package com.customer.crud.module;

public class Customer {
	
	private int id;
	private String name;
	private String cnt;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, String cnt) {
		super();
		this.id = id;
		this.name = name;
		this.cnt = cnt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", cnt=" + cnt + "]";
	}
	
	
}
