package com.example.demo;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class value_annotation {
//	@Value("${word}")
	private String name="Habibi";
	@GetMapping("/value")
	public String getValue() {
		return "Welcome to my world "+name;
	}
}
