package com.codehub.java.junit;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestJunit2 extends TestCase{
	@Before
	public void setUp() {
		System.out.println("before.");
	}
	
	@Test
	public void testAdd() {
		System.out.println("Number of tset case: " + this.countTestCases());
		System.out.println("Test case name: " + this.getName());
		String str = "Junit is working fine.";
		assertEquals("Junit is working fine.", str);
	}
	
	@After
	public void tearDown() {
		System.out.println("down.");
	}
}
