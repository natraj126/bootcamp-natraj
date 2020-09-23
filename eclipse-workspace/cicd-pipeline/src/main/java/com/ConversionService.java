package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ConversionService {
	@GetMapping("/sum")
	public int sum() {
		int a = 30; int b = 20;
		return a+b;
	}

	@GetMapping("/subtract")
	public int subtract() {
		int a = 30; int b = 20;
		return a-b;
	}
	
	@GetMapping("/multiply")
	public int multiply() {
		int a = 30; int b = 20;
		return a*b;
	}
	
	@GetMapping("/div")
	public int div() {
		int a = 30; int b = 10;
		return a/b;
	}
	
	@GetMapping("/power")
	public int power() {
		int a = 2; int b = 3;
		return a^b;
	}
}
