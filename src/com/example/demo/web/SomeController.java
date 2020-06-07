package com.example.demo.web;

import com.example.demo.service.SomeService;

public class SomeController {
	
	
	public String showHello() {
		SomeService someService = new SomeService();
		return someService.showHello();
	}

}
