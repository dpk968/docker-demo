package com.dpk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	
	@GetMapping("/")
	public String getMethodName() {
		return new String("hello i'm running in docker");
	}
	

}
