package com.bvoc.Students.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

@GetMapping("/home")
	public String Greeting() {
		return "Good Mornig !!";
		
	}
}
