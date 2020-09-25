package com.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ArithmeticOprTest.class, 
	StringOprTest.class, StringOprTestParameterized.class})
public class AllTests {
	
}
