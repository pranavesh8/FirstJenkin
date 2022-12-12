package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class JenkinsPurposeController {
	
	@GetMapping("/wel")
	public String method() {
		return "Hai Pranavesh";
		
	}

}
