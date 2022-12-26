package com.lti.nsp.service;

import java.util.List;

import com.lti.nsp.entity.*;



public interface InstituteDetailsService {


	public InstituteDetail addInstitute(InstituteDetail addObj);	
	
	public List< InstituteDetail> getAllInstituteDetail ();
	
	
}

/*
public void deleteAddress(int instituteCode);
public void updateAddress(InstituteDetail updateObj);
public InstituteDetail getInstituteDetail(String instituteCode);

*/