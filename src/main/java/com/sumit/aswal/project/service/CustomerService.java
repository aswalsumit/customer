package com.sumit.aswal.project.service;

import java.util.List;
import com.sumit.aswal.project.model.Customer;

public interface CustomerService {
	
	Customer save(Customer customer);

	List<Customer> getAll();
	
	Customer getCustomerById(int id);
}
