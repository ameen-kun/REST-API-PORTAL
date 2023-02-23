package com.example.demo.ChallengeYourself;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ApiController {
	@GetMapping("/day1/challenge/family")
	public List<Family> getFamily(){
		List<Family> det=new ArrayList<>();
		det.add(new Family("Ashizuki",20,"Head"));
		det.add(new Family("Ash",20,"Son"));
		det.add(new Family("Ashi",20,"Daughter"));
		return det;
	}
}
