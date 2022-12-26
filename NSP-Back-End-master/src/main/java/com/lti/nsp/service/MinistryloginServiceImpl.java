package com.lti.nsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.nsp.entity.Ministry;
import com.lti.nsp.repository.MinistryloginRepository;

@Service("ministryloginservice")
public class MinistryloginServiceImpl implements  MinistryloginService
{
	
	@Autowired
	private MinistryloginRepository ministry;
	
	
	@Override
	public Ministry addMinistry(Ministry ministry1)
	{
		return ministry.save(ministry1);
	}

}
