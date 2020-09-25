package com.exceptions.ExceptionTestProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */


public class App 
{
	public static void printStringLen(String name) {
		System.out.println("String length: "+name.length());
	}
	
//	public static void readFile(String fileName) {
//		try {
//			FileInputStream fis = new FileInputStream(fileName);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	} 
	
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	//readFile("C:RIDHIMA BANSAL/resume.txt");
        String name="Ridhima";
        printStringLen(name);
    	
    	
        int z=0;
        try {
        	z=10/2;
        	System.out.println("Try is finished");
        }
        catch(ArithmeticException e) {
        	e.printStackTrace();
        }
        System.out.println("z = "+z);
    }
}
