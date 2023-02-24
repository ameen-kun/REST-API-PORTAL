package com.example.demo.Controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Models.Employee;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository serviceRepo;
@Autowired
EmployeeService sR;
@GetMapping("/getvalues")
public List<Employee> getdets(){
	return serviceRepo.findAll();
}
@PostMapping("/post")
public Employee postdets(@RequestBody Employee e) {
	return serviceRepo.save(e);
}
@GetMapping("/get/{id}")
public Optional<Employee> getdid(@PathVariable int id) {
	return sR.getsid(id);
}

}
