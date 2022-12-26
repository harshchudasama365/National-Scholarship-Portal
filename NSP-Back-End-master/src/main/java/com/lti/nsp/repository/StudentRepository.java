package com.lti.nsp.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lti.nsp.entity.ScholarshipApplication;
import com.lti.nsp.entity.studentreg;

public interface StudentRepository extends JpaRepository<studentreg , Long> {

	studentreg findByAadharNumber(String aadharNumber);
	
	@Query("Select s from ScholarshipApplication s where s.institution=?1")
	public List<ScholarshipApplication> findApplicationByInsID(String insId);
	
}
