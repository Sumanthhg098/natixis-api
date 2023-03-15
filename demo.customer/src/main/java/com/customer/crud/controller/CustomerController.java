package com.customer.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.customer.crud.module.Customer;
import com.customer.crud.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService ;
	
	
	
	public List<Customer> fetchAllData()
	{
		return customerService.fetch();
	}
}
