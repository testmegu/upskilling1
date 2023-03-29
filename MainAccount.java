package com.cg.exception;

public class MainAccount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    CurrentAccount current = new CurrentAccount();
	        SavingsAccount savings = new SavingsAccount();
	        current.deposite(500.00);
	        savings.deposite(500.00);
	        doWithdrawal(current);   
	        doWithdrawal(savings); 

	} public static void doWithdrawal(BankAccount acc) {
        boolean result = acc.withdraw(230.0);
        if (result) {
            System.out.println("Withdraw successfull...");
        } else {
            System.out.println("Withdraw fail...");
        }
    }


}
