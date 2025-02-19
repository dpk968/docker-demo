package com.dpk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	
	@GetMapping("/")
	public String getMethodName() {
		return new String("hello i'm running in docker");
	}
	

}
