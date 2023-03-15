package com.customer.crud.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.customer.crud.module.Customer;

@Service
public class CustomerRepo {

	private List<Customer> custmList;
	
	
	
	
	public CustomerRepo() {
		custmList = new ArrayList<Customer>();
		custmList.add(new Customer(1,"suraj","IND"));
		custmList.add(new Customer(2,"surya","ENG"));
		custmList.add(new Customer(3,"Ram","SL"));
	}


	public List<Customer> fetchAllData() {
		return custmList;
	}

}
