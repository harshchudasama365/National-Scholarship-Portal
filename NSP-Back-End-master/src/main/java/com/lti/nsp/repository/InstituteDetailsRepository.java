package com.lti.nsp.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.nsp.entity.InstituteDetail;

import java.util.*;


public interface InstituteDetailsRepository extends JpaRepository<InstituteDetail, Long> {

	Optional<InstituteDetail> findByInstiCode(String instiCode);
	InstituteDetail findByEmailid(String emailid);
	List<InstituteDetail> findByApplicationStatus(String applicationStatus);
	List<InstituteDetail> findByaffilatedUBName(String affilatedUBName);	
		
}
