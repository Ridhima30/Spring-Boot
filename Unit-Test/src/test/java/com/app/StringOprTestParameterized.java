package com.app;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringOprTestParameterized {

	@Parameter(value=0)
	public String s1;
	@Parameter(value=1)
	public String s2;
	@Parameter(value=2)
	public int idx;
	
	@Parameters
	public static Collection<Object []> testData(){
		Object data[][]= {
				{"Hi", "Hello", 0},{"Apple", "Orange", 2},
				{"Tuesday", "today", 4}
		};
		
		return Arrays.asList(data);
	}
	
	private static StringOpr strObj=null;
	
	@BeforeClass
	public static void beforeClass() {
		StringOprTestParameterized.strObj=new StringOpr();
	}
	
	@Test
	public void testConcat() {
		assertEquals((s1+s2),strObj.concat(s1, s2));
	}
	
	@Test
	public void testGetChar() {
		assertEquals(s1.charAt(idx),strObj.getChar(s1, idx),0.0);
	}
	
	@Test
	public void testLength() {
		assertEquals(s1.length(),strObj.length(s1),0.0);
	}

}
