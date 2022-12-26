package com.lti.nsp.dto;

import org.springframework.web.multipart.MultipartFile;

public class DocumentsDto {
	
	String aadhar;
	
	MultipartFile studentDocuments;

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public MultipartFile getStudentDocuments() {
		return studentDocuments;
	}

	public void setStudentDocuments(MultipartFile studentDocuments) {
		this.studentDocuments = studentDocuments;
	}
	
}
