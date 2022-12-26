package com.lti.nsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.nsp.entity.*;

public interface NodalOfficerRepository extends JpaRepository<NodalOfficer , Long> {

	NodalOfficer findByUsername(String username);
	
	
}
