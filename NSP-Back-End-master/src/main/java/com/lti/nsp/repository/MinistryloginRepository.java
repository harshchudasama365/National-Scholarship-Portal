package com.lti.nsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.nsp.entity.Ministry;


public interface MinistryloginRepository  extends JpaRepository<Ministry , Long> {

	Ministry findByUsername(String username);
}
