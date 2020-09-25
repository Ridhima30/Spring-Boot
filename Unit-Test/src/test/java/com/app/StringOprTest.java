package com.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringOprTest {

	private static StringOpr s1=null;
	
	@BeforeClass
	public static void beforeClass() {
		StringOprTest.s1=new StringOpr();
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		StringOprTest.s1=null;
		System.out.println("After Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals("HelloWorld", s1.concat("Hello", "World"));
		System.out.println("Concat");
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
		assertEquals('H', s1.getChar("Hello", 0),0.0);
		System.out.println("getChar");
	}
	
	@Test //(timeout = 2000)
	public void test3() {
		//fail("Not yet implemented");
		assertEquals(5, s1.length("Hello"),0.0);
		System.out.println("Length");
//		while(true) {
//			System.out.println("Inside Loop");
//		}
	}

}
