package com.ecommerce.customer.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.customer.dto.CustomerDto;
import com.ecommerce.customer.model.Customer;
import com.ecommerce.customer.repository.CustomerRepository;
import com.ecommerce.customer.repository.RoleRepository;
import com.ecommerce.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private RoleRepository repository;

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public CustomerDto save(CustomerDto customerDto) {

		Customer customer = new Customer();
		customer.setFirstName(customerDto.getFirstName());
		customer.setLastName(customerDto.getLastName());
		customer.setUsername(customerDto.getUsername());
		customer.setPassword(customerDto.getPassword());
		customer.setRoles(Arrays.asList(repository.findByName("CUSTOMER")));

		Customer customerSave = customerRepository.save(customer);
		return mapperDTO(customerSave);
	}

	@Override
	public Customer findByUsername(String username) {
		return customerRepository.findByUsername(username);
	}

	@Override
	public Customer saveInfor(Customer customer) {
		Customer customer1 = customerRepository.findByUsername(customer.getUsername());
		customer1.setAddress(customer.getAddress());
		customer1.setCity(customer.getCity());
		customer1.setCountry(customer.getCountry());
		customer1.setPhoneNumber(customer.getPhoneNumber());
		return customerRepository.save(customer1);
	}

	private CustomerDto mapperDTO(Customer customer) {
		CustomerDto customerDto = new CustomerDto();
		customerDto.setFirstName(customer.getFirstName());
		customerDto.setLastName(customer.getLastName());
		customerDto.setPassword(customer.getPassword());
		customerDto.setUsername(customer.getUsername());
		return customerDto;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
