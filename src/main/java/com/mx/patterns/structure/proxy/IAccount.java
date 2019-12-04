package com.mx.patterns.structure.proxy;

public interface IAccount {

	Account withdrawals(Account account, double amount);
	Account deposit(Account account, double amount);
	void showBalance(Account account);
	
}
