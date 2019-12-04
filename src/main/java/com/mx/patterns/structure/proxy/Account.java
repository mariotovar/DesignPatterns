package com.mx.patterns.structure.proxy;

public class Account {
	
	private int idAccount;
	private String user;
	private double startBalance;

	public Account(int idAccount, String user, double startBalance) {
		this.idAccount = idAccount;
		this.user = user;
		this.startBalance = startBalance;
	}

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public double getStartBalance() {
		return startBalance;
	}

	public void setStartBalance(double startBalance) {
		this.startBalance = startBalance;
	}	
	
	

}
