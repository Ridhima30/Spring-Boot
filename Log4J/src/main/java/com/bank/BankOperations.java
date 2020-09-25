package com.bank;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BankOperations {

	static Logger logger = LogManager.getLogger(BankOperations.class.getName());
	
	public static Account createAccount(int accno, String name, double balance) {
		logger.trace("accno: " + accno);		
		logger.info("New Account created successfully!!");
		return new Account(accno, name, balance);
	}

}