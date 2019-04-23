package com.codehub.java.junit;

import org.junit.*;

import static org.junit.Assert.*;

//Ignore annotation use as class, ignore all test cases.
//@Ignore
public class TestAssertions {
	//execute before class
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class.");
	}
	
	//execute after class
	@AfterClass
	public static void afterClass()	{
		System.out.println("in after class.");
	}
	
	//execute before test
	@Before
	public void before() {
		System.out.println("in before.");
	}
	
	//execute after test
	@After
	public void after() {
		System.out.println("in after.");
	}
	
	//test case
	@Test
	public void testAssertions() {
		System.out.println("the first test case.");
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		int num1 = 5;
		int num2 = 6;
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		//Check that two objects are equal
		assertEquals(str1, str2);
		
		//Check that a condition is true
		assertTrue(num1 < num2);
		
		//Check that a condition is false
		assertFalse(num1 > num2);
		
		//Check that an object isn't null
		assertNotNull(str1);
		
		//Check that an object is null
		assertNull(str3);
		
		//Check if two object references point to the same object
		assertSame(str4, str5);
		
		//Check if two object references not point to the same object
		assertNotSame(str1, str3);
		
		//Check whether two arrays are equal to each other
		assertArrayEquals(expectedArray, resultArray);
	}
	
	@Test
	public void test2() {
		System.out.println("the second test case.");
	}
	
	@Test(timeout = 1000)
	public void testTimeOut() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("the timeout test case.");
	}
	
	@Test(expected = ArithmeticException.class) 
	public void testException() {
		int a = 0;
		int b = 1/a;
		System.out.println("b: " + b);
	}
	
	@Ignore
	@Test
	public void ignoreMethodTest() {
		System.out.println("this test case is ignore.");
	}
}
