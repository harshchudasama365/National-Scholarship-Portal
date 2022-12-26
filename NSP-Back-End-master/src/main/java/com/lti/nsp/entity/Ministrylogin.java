package com.lti.nsp.entity;

import javax.persistence.*;

@Entity
@Table
public class Ministrylogin {
	
	@Id
	String username;
	String password;
	public Ministrylogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Ministrylogin() {
		super();
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
