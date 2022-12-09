package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsPurposeController {
	
	@GetMapping("/welcome")
	public String method() {
		return "Hai Pranavesh";
		
	}

}
