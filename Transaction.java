package com.dhanushpandi.assignment3;

public class Transaction {
	  public final double transactionFee = 5.0;

	    public final void performTransaction(Account account, double amount, String type) {
	        if (type.equals("deposit")) {
	            account.deposit(amount - transactionFee);
	        } else if (type.equals("withdraw")) {
	            account.withdraw(amount + transactionFee);
	        }
	    }
}
