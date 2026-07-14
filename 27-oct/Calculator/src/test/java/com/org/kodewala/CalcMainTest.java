package com.org.kodewala;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalcMainTest {
	
	static CalcMain calcMain;
	
	@BeforeAll
	public static void beforeAll() {
		calcMain = new CalcMain();
		System.out.println("setup before all....");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("setup before each....");
	}

	@Test
	public void testAddNumber() {
		
		
		int expected = 16;
		int actual = calcMain.addNumber(4, 12);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFirstZeroNumber() {
		// TODO Auto-generated method stub

		
		int expected = 12;
		int actual = calcMain.addNumber(0, 12);
		
		assertEquals(expected, actual);
	}
	
	@Disabled
	public void testBothZeroNumber() {
		
		
		int expected = 0;
		int actual = calcMain.addNumber(0, 0);
		
		assertEquals(expected, actual);
	}

	
}
