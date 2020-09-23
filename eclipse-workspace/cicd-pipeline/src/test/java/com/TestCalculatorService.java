package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {
	
	CalculatorService calc = new CalculatorService();

	@Test
	public void testSum() {
		Assertions.assertEquals(calc.sum(), 50);
	}
	
	@Test
	public void testSub() {
		Assertions.assertEquals(calc.subtract(), 10);
	}
	
	@Test
	public void testMul() {
		Assertions.assertEquals(calc.multiply(), 600);
	}
	
	@Test
	public void testDiv() {
		Assertions.assertEquals(calc.div(), 3);
	}
	
	@Test
	public void testPower() {
		Assertions.assertEquals(calc.power(), 1);
	}
}