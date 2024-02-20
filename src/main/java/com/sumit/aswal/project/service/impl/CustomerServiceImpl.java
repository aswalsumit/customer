package com.sumit.aswal.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.aswal.project.dao.CustomerRepository;
import com.sumit.aswal.project.model.Customer;
import com.sumit.aswal.project.service.CustomerService;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository repository;
	
	public Customer save(Customer customer) {
		return repository.save(customer);
	}

	public List<Customer> getAll() {
		return repository.findAll();
	}
	
	public Customer getCustomerById(int id) {
		return repository.findById(id).get();
	}

}
