package com.example.demo.web;

import com.example.demo.service.SomeService;

public class SomeController {
	
	
	public String showHello() {
		// Some comment
		SomeService someService = new SomeService();
		return someService.showHello();
	}

}
