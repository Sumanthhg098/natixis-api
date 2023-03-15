package com.customer.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.crud.module.Customer;
import com.customer.crud.repo.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;

	public List<Customer> fetch() {
		return  customerRepo.fetchAllData() ;
	}

}
