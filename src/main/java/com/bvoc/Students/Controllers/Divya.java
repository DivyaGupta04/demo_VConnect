package com.bvoc.Students.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Divya {

	@GetMapping("/Name")
	public String Name() {
		return " My name is Divya Gupta";
	}
	
	
}
