package com.mouritech.feigndemo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
private static List<Employee> empList = new ArrayList<>();
	
	static {
		empList.add(new Employee(1, "mahi", 35,"hyd"));
		empList.add(new Employee(2, "rajitha", 25,"hyd"));
		empList.add(new Employee(3, "sujitha", 35,"hyd"));
		empList.add(new Employee(4, "pavani", 15,"hyd"));
		empList.add(new Employee(5, "ramya", 65,"hyd"));
	}
	
	@GetMapping("/emp")
	public ResponseEntity<?> getEmployeeDetails(){
		return ResponseEntity.ok(empList);
	}
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<?> getEmployeeDetails(@PathVariable("empid") int empid){
		Employee emp = findEmployee(empid);
		if(emp == null) {
			return ResponseEntity.badRequest().body("Invalid Employee Id");
		}
		return ResponseEntity.ok(emp);
		
	}

	private Employee findEmployee(int empid) {

		return empList.stream()
				.filter(emp -> emp.getEmpid().equals(empid))
				.findFirst().orElse(null);
	}
}
