package com.mouritech.feigndemo;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "Employee-Service"/*,url = "http://localhost:8081"*/)
public interface EmployeeService {
	@RequestMapping(value = "/emp",method = RequestMethod.GET)
	public List<Employee> getAllEmployee();
	
	
	@RequestMapping(value = "/emp/{empid}",method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable("empid") int empid);

}
