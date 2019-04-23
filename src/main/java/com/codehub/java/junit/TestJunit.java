package com.codehub.java.junit;

import junit.framework.TestCase;
import org.junit.Test;

public class TestJunit extends TestCase{
	@Test
	public void testAdd() {
	    
		System.out.println("Test case name: " + this.getName());
		String str = "Junit is working fine.";
		assertEquals("Junit is working fine.", str);
	}
}
