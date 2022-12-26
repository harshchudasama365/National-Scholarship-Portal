package com.lti.nsp.entity;

import javax.persistence.*;

@Entity
@Table(name = "institutecreds")
public class InstituteLogin {

	@Id
	String emailid;
	String password;
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
