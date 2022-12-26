package com.lti.nsp.entity;

import javax.persistence.*;


@Entity
@Table(name="studentdatarecord1")
public class studentreg {


	
	@Id
	String aadharNumber;
	String email;
	String password ; 
    String name; 
    String dateOfBirth;
	String stateofDomicile;
    String institutecode;
	String gender;
	String mobileNumber;
	String district;
	String bankifsccode;
	String accountnumber;
	String bankname;
	String applicationstatus;
//	
//	@JsonIgnore
//	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
//	ScholarshipApplication scholarapp;
//	
//	public ScholarshipApplication getScholarapp() {
//		return scholarapp;
//	}
//
//
//
//	public void setScholarapp(ScholarshipApplication scholarapp) {
//		this.scholarapp = scholarapp;
//	}
//


	public String getApplicationstatus() {
		return applicationstatus;
	}



	public void setApplicationstatus(String applicationstatus) {
		this.applicationstatus = applicationstatus;
	}



	public String getAadharNumber() {
		return aadharNumber;
	}



	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getStateofDomicile() {
		return stateofDomicile;
	}



	public void setStateofDomicile(String stateofDomicile) {
		this.stateofDomicile = stateofDomicile;
	}



	public String getInstitutecode() {
		return institutecode;
	}



	public void setInstitutecode(String institutecode) {
		this.institutecode = institutecode;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public String getBankifsccode() {
		return bankifsccode;
	}



	public void setBankifsccode(String bankifsccode) {
		this.bankifsccode = bankifsccode;
	}



	public String getAccountnumber() {
		return accountnumber;
	}



	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}



	public String getBankname() {
		return bankname;
	}



	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

}
	
	
	

	

