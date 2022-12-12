package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsPurposeController {
	
	@RequestMapping("/wel")
	public String method() {
		return "Hai Pranavesh";
		
	}

}
