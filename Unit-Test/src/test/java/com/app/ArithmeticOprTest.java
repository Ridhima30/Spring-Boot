package com.app;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArithmeticOprTest {

	@Parameter(value=0)
	public int x;
	
	@Parameter(value=1)
	public int y;
	
	@Parameters
	public static Collection<Object []> testData(){
		Object data[][] = {
				{50,10}, {80,2}, {45,9}, {66,3}
		};
		return Arrays.asList(data);
	}
	
	@Test
	public void test() {
		ArithmeticOpr ar=new ArithmeticOpr();
		assertEquals((x/y), ar.divide(x,y), 0.0 );
	}

}
