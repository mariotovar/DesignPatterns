package com.mx.patterns.structure.proxy.impl;

import com.mx.patterns.structure.proxy.Account;
import com.mx.patterns.structure.proxy.IAccount;

public class AccountBImpl implements IAccount {

	public Account withdrawals(Account account, double amount) {
		double currentBalance = account.getStartBalance() - amount;
		account.setStartBalance(currentBalance);
		System.out.println("Current Balance: " + account.getStartBalance());
		return account;
	}

	public Account deposit(Account account, double amount) {
		double currentBalance = account.getStartBalance() + amount + 0.20;
		account.setStartBalance(currentBalance);
		System.out.println("Current Balance: " + account.getStartBalance());
		return account;
	}

	public void showBalance(Account account) {
		System.out.println("Current Balance: " + account.getStartBalance());
	}

}
