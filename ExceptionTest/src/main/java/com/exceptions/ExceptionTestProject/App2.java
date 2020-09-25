package com.exceptions.ExceptionTestProject;

class InsufficientBalanceException extends RuntimeException {
	
	private String message;

	public InsufficientBalanceException() {
		this.message = "";
	}
	
	public InsufficientBalanceException(String message) {
		super();
		this.message = message;
	}
	
	public String toString() {
		return "Insufficient balance funds. "+ this.message;
	}
	
}

class Account{
	
	private int balance;
	
	public Account(int balance){
		this.balance=balance;
	}
	
	public void withdrawl(int amount) {
		
		if(amount> balance)
			throw new InsufficientBalanceException("Your current balance is "+ balance);		
		balance-=amount;
		System.out.println("Amount has been withdrawn. Updated balance is "+balance);
	
	}
}

public class App2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac=new Account(10000);
		
		
		try {
			ac.withdrawl(4000);
			ac.withdrawl(120000);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
