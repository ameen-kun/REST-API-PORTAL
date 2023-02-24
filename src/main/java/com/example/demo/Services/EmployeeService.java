package com.example.demo.Services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
EmployeeRepository sRepo;

public Optional<Employee> getsid(int id){
	return sRepo.findById(id);
}

}
