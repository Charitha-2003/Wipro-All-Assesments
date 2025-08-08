package com.example.ecommerce_app_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce_app_rest_api.model.Customer;
import com.example.ecommerce_app_rest_api.service.CustomerService;



@RestController
@RequestMapping("/api")
public class AppController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/all")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomers();
	}

	@PostMapping("/add")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	@GetMapping("/all/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long id){
		Customer customer = customerService.getCustomerById(id);
		return  new ResponseEntity<Customer>(customer,HttpStatus.OK) ;
	}
	
	@PutMapping("/put/{id}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long id) {
		Customer existingCustomer = customerService.getCustomerById(id);
    	existingCustomer.setName(customer.getName());
    	existingCustomer.setPassword(customer.getPassword());
    	existingCustomer.setEmail(customer.getEmail());
    	
    	Customer result = customerService.saveCustomer(existingCustomer);
    	
    	return result;
		
		
		
	}
	@DeleteMapping("/all/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);
		return "Customer deleted with this "+id;
		
	}
}