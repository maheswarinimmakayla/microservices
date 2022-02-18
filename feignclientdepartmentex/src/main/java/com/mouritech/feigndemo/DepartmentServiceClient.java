package com.mouritech.feigndemo;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "department-service"/*,url = "http://localhost:8081"*/)
public interface DepartmentServiceClient {
	
	@RequestMapping(value = "/dep",method = RequestMethod.GET)
	public List<Department> getAllDepartments();

    @RequestMapping(value = "/dep/{depId}",method = RequestMethod.GET)
	public Department getDepartment(@PathVariable("depId") int depId);

}
