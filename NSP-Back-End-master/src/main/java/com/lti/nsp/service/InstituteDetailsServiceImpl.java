package com.lti.nsp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.nsp.entity.InstituteDetail;
import com.lti.nsp.repository.InstituteDetailsRepository;

@Service
@Transactional
public class InstituteDetailsServiceImpl implements InstituteDetailsService {


	@Autowired
	private InstituteDetailsRepository instituterepo;
	
	@Override
	public InstituteDetail addInstitute(InstituteDetail instituteObj) 
	{
		
			return instituterepo.save(instituteObj);
		}

	@Override
	public List<InstituteDetail> getAllInstituteDetail() {
		return instituterepo.findAll();
	}	
}




/*
@Override
public void deleteAddress(int instituteCode) {
// TODO Auto-generated method stub

}

@Override
public void updateAddress(InstituteDetail updateObj) {


}

@Override
public InstituteDetail getInstituteDetail(String instituteCode) {

@Override
public InstituteDetail getInstituteDetail(String hi) {
return instituterepo.findById(hi);
}

}*/
