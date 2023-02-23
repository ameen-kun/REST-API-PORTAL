package com.example.demo;

import org.springframework.web.bind.annotation.*;
@RestController
public class welcome {
	@GetMapping("/day1/welcome")
	public String Welcome() {
		return "Welcome to Spring Boot!";
	}
}
