package com.example.demo.entities;

public class User {
	
	public int user_id;
	public String user_name;
	String pan;
	String email;
	String phone;
	double cash;
	double equity_value;
	
	public User()
	{
		
	}
	
	public User(int user_id, String user_name, String pan, String email, String phone, double cash,
			double equity_value) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.pan = pan;
		this.email = email;
		this.phone = phone;
		this.cash = cash;
		this.equity_value = equity_value;
	}
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getCash() {
		return cash;
	}
	public void setCash(double cash) {
		this.cash = cash;
	}
	public double getEquity_value() {
		return equity_value;
	}
	public void setEquity_value(double equity_value) {
		this.equity_value = equity_value;
	}
	
	

}

