package com.mx.design.patterns.structure.proxy;

import com.mx.design.patterns.structure.proxy.impl.AccountBImpl;

public class App {
	
	public static void main(String[] args) {
		
		Account account = new Account(1, "accountXY", 100);
		
		IAccount accountProxy = new AccountProxy(new AccountBImpl());
		accountProxy.showBalance(account);
		account = accountProxy.deposit(account, 50);
		account = accountProxy.withdrawals(account, 20);
		accountProxy.showBalance(account);
		
	}	

}
