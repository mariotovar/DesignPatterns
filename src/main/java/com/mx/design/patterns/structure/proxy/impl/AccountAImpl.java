package com.mx.design.patterns.structure.proxy.impl;

import com.mx.design.patterns.structure.proxy.Account;
import com.mx.design.patterns.structure.proxy.IAccount;

public class AccountAImpl implements IAccount {

	public Account withdrawals(Account account, double amount) {
		double currentBalance = account.getStartBalance() - amount;
		account.setStartBalance(currentBalance);
		System.out.println("Current Balance: " + account.getStartBalance());
		return account;
	}

	public Account deposit(Account account, double amount) {
		double currentBalance = account.getStartBalance() + amount;
		account.setStartBalance(currentBalance);
		System.out.println("Current Balance: " + account.getStartBalance());
		return account;
	}

	public void showBalance(Account account) {
		System.out.println("Current Balance: " + account.getStartBalance());
	}

}
