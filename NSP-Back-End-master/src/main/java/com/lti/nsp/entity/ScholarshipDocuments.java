package com.lti.nsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="nsp_scholarship_docs")
public class ScholarshipDocuments {
	
	@Id
	@GeneratedValue(generator = "scholar_docs_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "scholar_docs_seq",initialValue=1000 ,allocationSize = 1)
	int scholarshipDocumentsId;
	
	String studentDocuments;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="aadhar")
	ScholarshipApplication scholarship;
	
	public ScholarshipDocuments() {
		
	}
	
	public ScholarshipDocuments(String studentDocuments) {
		this.studentDocuments = studentDocuments;
	}
	
	public int getScholarshipDocumentsId() {
		return scholarshipDocumentsId; 
	}
	public void setScholarshipDocumentsId(int scholarshipDocumentsId) {
		this.scholarshipDocumentsId = scholarshipDocumentsId;
	}
	
	
	public String getStudentDocuments() {
		return studentDocuments;
	}

	public void setStudentDocuments(String studentDocuments) {
		this.studentDocuments = studentDocuments;
	}

	public ScholarshipApplication getScholarship() {
		return scholarship;
	}

	public void setScholarship(ScholarshipApplication scholarship) {
		this.scholarship = scholarship;
	}
	

}
