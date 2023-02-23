package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class colorgame {
	public String getColor() {
		return "Matte Black";
	}
	@GetMapping("/day1/colorgame")
	public String getMyFav() {
		return "My favourite color is "+getColor();
	}
}
