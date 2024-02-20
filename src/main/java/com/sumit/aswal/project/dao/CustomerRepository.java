package com.sumit.aswal.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.aswal.project.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
