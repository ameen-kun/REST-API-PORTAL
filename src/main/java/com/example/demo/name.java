package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class name {
	private String name;
	public void setName(String a) {
		name=a;
	}
	@GetMapping("/day1/name")
	public String getName() {
		setName("Ashizuki");
		return "Welcome "+name+"!";
	}
}
