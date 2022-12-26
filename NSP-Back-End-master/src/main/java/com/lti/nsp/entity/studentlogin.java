package com.lti.nsp.entity;

import javax.persistence.*;

@Entity
@Table(name = "studentcreds")
public class studentlogin {

	@Id
	String aadharNumber;
	String password;
	
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
