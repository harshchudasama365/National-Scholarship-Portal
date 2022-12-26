package com.lti.nsp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "scholarapp")
public class ScholarshipApplication {

	@Id
	private String aadhar;
	private String phoneNumber;
	private String instiCode;
	private String name;
	private String dob;
	private String email;
	private String religion;
	private String community;
	private String fatherName;
	private String motherName;
	private String annualIncome;
	private String institution;
	private String presentClass;
	private String presentClassYear;
	private String modeOfStudy;
	private String classStartDate;
	private String university;
	private String previousClass;
	private String previousClassYear;
	private String previousPercentage;
	private String tenthRollNo;
	private String tenthBoard;
	private String tenthYear;
	private String tenthPercentage;
	private String twelthRollNo;
	private String twelthBoard;
	private String twelthYear;
	private String twelthPercentage;
	private String admissionFee;
	private String tuitionFee;
	private String otherFee;
	private String isDisabled;
	private String typeOfDisability;
	private String disabilityPercenage;
	private String maritalStatus;
	private String parentsProfession;
	private String state;
	private String district;
	private String taluk;
	private String houseNo;
	private String streerNo;
	private String pincode;
	private String gender;
	private String scheme;
	
	String finalStatus;
	

	public String getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	public String getInstiCode() {
		return instiCode;
	}
	public void setInstiCode(String instiCode) {
		this.instiCode = instiCode;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getPresentClass() {
		return presentClass;
	}
	public void setPresentClass(String presentClass) {
		this.presentClass = presentClass;
	}
	public String getPresentClassYear() {
		return presentClassYear;
	}
	public void setPresentClassYear(String presentClassYear) {
		this.presentClassYear = presentClassYear;
	}
	public String getModeOfStudy() {
		return modeOfStudy;
	}
	public void setModeOfStudy(String modeOfStudy) {
		this.modeOfStudy = modeOfStudy;
	}
	public String getClassStartDate() {
		return classStartDate;
	}
	public void setClassStartDate(String classStartDate) {
		this.classStartDate = classStartDate;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getPreviousClass() {
		return previousClass;
	}
	public void setPreviousClass(String previousClass) {
		this.previousClass = previousClass;
	}
	public String getPreviousClassYear() {
		return previousClassYear;
	}
	public void setPreviousClassYear(String previousClassYear) {
		this.previousClassYear = previousClassYear;
	}
	public String getPreviousPercentage() {
		return previousPercentage;
	}
	public void setPreviousPercentage(String previousPercentage) {
		this.previousPercentage = previousPercentage;
	}
	public String getTenthRollNo() {
		return tenthRollNo;
	}
	public void setTenthRollNo(String tenthRollNo) {
		this.tenthRollNo = tenthRollNo;
	}
	public String getTenthBoard() {
		return tenthBoard;
	}
	public void setTenthBoard(String tenthBoard) {
		this.tenthBoard = tenthBoard;
	}
	public String getTenthYear() {
		return tenthYear;
	}
	public void setTenthYear(String tenthYear) {
		this.tenthYear = tenthYear;
	}
	public String getTenthPercentage() {
		return tenthPercentage;
	}
	public void setTenthPercentage(String tenthPercentage) {
		this.tenthPercentage = tenthPercentage;
	}
	public String getTwelthRollNo() {
		return twelthRollNo;
	}
	public void setTwelthRollNo(String twelthRollNo) {
		this.twelthRollNo = twelthRollNo;
	}
	public String getTwelthBoard() {
		return twelthBoard;
	}
	public void setTwelthBoard(String twelthBoard) {
		this.twelthBoard = twelthBoard;
	}
	public String getTwelthYear() {
		return twelthYear;
	}
	public void setTwelthYear(String twelthYear) {
		this.twelthYear = twelthYear;
	}
	public String getTwelthPercentage() {
		return twelthPercentage;
	}
	public void setTwelthPercentage(String twelthPercentage) {
		this.twelthPercentage = twelthPercentage;
	}
	public String getAdmissionFee() {
		return admissionFee;
	}
	public void setAdmissionFee(String admissionFee) {
		this.admissionFee = admissionFee;
	}
	public String getTuitionFee() {
		return tuitionFee;
	}
	public void setTuitionFee(String tuitionFee) {
		this.tuitionFee = tuitionFee;
	}
	public String getOtherFee() {
		return otherFee;
	}
	public void setOtherFee(String otherFee) {
		this.otherFee = otherFee;
	}
	public String getIsDisabled() {
		return isDisabled;
	}
	public void setIsDisabled(String isDisabled) {
		this.isDisabled = isDisabled;
	}
	public String getTypeOfDisability() {
		return typeOfDisability;
	}
	public void setTypeOfDisability(String typeOfDisability) {
		this.typeOfDisability = typeOfDisability;
	}
	public String getDisabilityPercenage() {
		return disabilityPercenage;
	}
	public void setDisabilityPercenage(String disabilityPercenage) {
		this.disabilityPercenage = disabilityPercenage;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getParentsProfession() {
		return parentsProfession;
	}
	public void setParentsProfession(String parentsProfession) {
		this.parentsProfession = parentsProfession;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTaluk() {
		return taluk;
	}
	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreerNo() {
		return streerNo;
	}
	public void setStreerNo(String streerNo) {
		this.streerNo = streerNo;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
//	
//	public String getFinalStatus() {
//		return finalStatus;
//	}
//	public void setFinalStatus(String finalStatus) {
//		this.finalStatus = finalStatus;
//	}
//	
	
}
