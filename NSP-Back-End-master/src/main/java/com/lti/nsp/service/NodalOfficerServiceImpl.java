package com.lti.nsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.nsp.entity.NodalOfficer;
import com.lti.nsp.repository.NodalOfficerRepository;

@Service("nodalofficerservice")
public class NodalOfficerServiceImpl implements NodalOfficerService {

	
	@Autowired
	private NodalOfficerRepository nodal;
	
	@Override
	public NodalOfficer addNodal(NodalOfficer nodal1) {
		return nodal.save(nodal1);
	}

	
	
}
