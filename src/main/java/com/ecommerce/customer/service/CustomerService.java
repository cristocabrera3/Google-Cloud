package com.ecommerce.customer.service;

import java.util.List;

import com.ecommerce.customer.dto.CustomerDto;
import com.ecommerce.customer.model.Customer;

public interface CustomerService {

	CustomerDto save(CustomerDto customerDto);

	Customer findByUsername(String username);

	Customer saveInfor(Customer customer);

	List<Customer> findAll();
}
