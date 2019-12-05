package com.mx.design.patterns.structure.proxy;

import java.util.logging.Logger;

import com.mx.design.patterns.structure.proxy.impl.AccountAImpl;

public class AccountProxy implements IAccount {

	private IAccount realAccount;
	private final static Logger LOGGER = Logger.getLogger(AccountProxy.class.getName());

	public AccountProxy(IAccount realAccount) {
		this.realAccount = realAccount;
	}
	
	public Account withdrawals(Account account, double amount) {
		LOGGER.info("----Account Proxy - Withdrawals----");
		if (realAccount == null) {
			realAccount = new AccountAImpl();
			return realAccount.withdrawals(account, amount);
		} else {
			return realAccount.withdrawals(account, amount);
		}
	}

	public Account deposit(Account account, double amount) {
		LOGGER.info("----Account Proxy - Deposit----");
		if (realAccount == null) {
			realAccount = new AccountAImpl();
			return realAccount.deposit(account, amount);
		} else {
			return realAccount.deposit(account, amount);
		}
	}

	public void showBalance(Account account) {
		LOGGER.info("----Account Proxy - Show Balance----");
		if (realAccount == null) {
			realAccount = new AccountAImpl();
			realAccount.showBalance(account);
		} else {
			realAccount.showBalance(account);
		}
	}

}
