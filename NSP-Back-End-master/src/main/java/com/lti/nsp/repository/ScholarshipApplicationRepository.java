package com.lti.nsp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lti.nsp.entity.ScholarshipApplication;

public interface ScholarshipApplicationRepository extends JpaRepository<ScholarshipApplication, String> {

	
	List<ScholarshipApplication> findByFinalStatus(String finalStatus);
	public Optional<ScholarshipApplication> findByAadhar(String aadhar);
	public Optional<ScholarshipApplication> deleteByAadhar(String aadhar);
	List<ScholarshipApplication> findByInstiCode(String instiCode);
	
}
