package com.mouritech.feigndemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/fetchemp")
	public ResponseEntity<?> getProducts(){
		return ResponseEntity.ok(employeeService.getAllEmployee());
	}

	@GetMapping("/emp/{empid}")
	public ResponseEntity<?> getProduct(@PathVariable("empid") int empid){
		Employee employee = employeeService.getEmployee(empid);
		return ResponseEntity.ok(employee);
	}
}
