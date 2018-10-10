package com.revature.beans;

public class Customer {
	private int user_id;
	private String username;
	
	public Customer(int user_id, String username) {
		super();
		this.user_id = user_id;
		this.username = username;
	}
	@Override
	public String toString() {
		return "Customer [user_id=" + user_id + ", username=" + username + "]";
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
}
