package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.howtodoinjava.demo.model.Address;
import com.howtodoinjava.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/employee")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		
		Employee emp = new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com");	
		
		Address add = restTemplate.getForObject("http://add-details/address", Address.class);
		emp.setAddress(add);
		employeesList.add(emp);
		
		return employeesList;
    }

}
