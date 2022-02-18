package com.mouritech.feigndemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DepartmentController {
	@Autowired
	private DepartmentServiceClient departmentServiceClient;
	
	@GetMapping("/fetchdep")
	public ResponseEntity<?> getDepartment(){
		return ResponseEntity.ok(departmentServiceClient.getAllDepartments());
	}

	@GetMapping("/dep/{depId}")
	public ResponseEntity<?> getDepartment(@PathVariable("depId") int depId){
		Department department = departmentServiceClient.getDepartment(depId);
		return ResponseEntity.ok(department);
	}
}
