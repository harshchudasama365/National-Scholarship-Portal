package com.lti.nsp.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import com.lti.nsp.entity.InstituteDetail;
import com.lti.nsp.entity.InstituteLogin;
import com.lti.nsp.entity.ScholarshipApplication;
import com.lti.nsp.entity.studentreg;
import com.lti.nsp.repository.InstituteDetailsRepository;
import com.lti.nsp.repository.ScholarshipApplicationRepository;
import com.lti.nsp.repository.StudentRepository;
import com.lti.nsp.service.InstituteDetailsServiceImpl;

import org.springframework.web.bind.annotation.*;



@RestController  
@CrossOrigin(origins = "http://localhost:4200")
public class InstituteController {

	@Autowired
	private InstituteDetailsServiceImpl instituteImpl;
	
	@Autowired
	StudentRepository studentRepo;
	
	@Autowired
	InstituteDetailsRepository institute;
	
	@Autowired
	ScholarshipApplicationRepository sar;
	
	List<ScholarshipApplication> sa;
	
	//adding institute
	@PostMapping("/institutes")
	public InstituteDetail addInstitute(@Valid@RequestBody InstituteDetail application)
	{
		instituteImpl.addInstitute(application);
		return application;
	}
	
	//view all institute details
	@GetMapping("/instituterecord")
	public List<InstituteDetail> getAllInstituteDetail() {
		// TODO Auto-generated method stub
		return instituteImpl.getAllInstituteDetail();
	}

	
	//login validation
	@PostMapping("/institutelogin")
	public boolean validateUser(@RequestBody InstituteLogin sl) {
		String a = sl.getEmailid();
		String p = sl.getPassword();
		List<InstituteDetail> ls = instituteImpl.getAllInstituteDetail();
		
		for(InstituteDetail s : ls) {
			if((a.equals(s.getEmailid())) && (p.equals(s.getPassword()))) {
				return true;
			}
		}
		return false;
	}
	
	
	//find institute by email
	@GetMapping("/institutes/{emailid}")
	public InstituteDetail institutehome(@PathVariable String emailid) {
		InstituteDetail institute1 = institute.findByEmailid(emailid);
		return institute1;
	}
	
	//find institute by University Board Name
		@GetMapping("/institutesbyUname/{uname}")
		public List<InstituteDetail> institutebyBname(@PathVariable String uname) { 
			return institute.findByaffilatedUBName(uname);
		}
	
	@GetMapping("/studentininstitute/{emailid}")
	public List<ScholarshipApplication> findStudents(@PathVariable String emailid){
		InstituteDetail ins = institute.findByEmailid(emailid);
		String code = ins.getInstiCode();
		System.out.println(code);
		return studentRepo.findApplicationByInsID(code);
	}
	
	@PutMapping("/instiApproval/{instiCode}")
	public String updateStatus(@PathVariable(value="instiCode") String instiCode) {
		Optional<InstituteDetail> i = institute.findByInstiCode(instiCode);
		InstituteDetail application = i.get(); 
		List<ScholarshipApplication> scholar = sar.findByInstiCode(instiCode);
		studentreg reg = null;
		for(ScholarshipApplication sa : scholar)
		{
		String aadharNoo  = sa.getAadhar();
			reg =  studentRepo.findByAadharNumber(aadharNoo);
		reg.setApplicationstatus("APPROVED BY INSTITUTE");
			studentRepo.save(reg);
		}
		application.setApplication_status("approved by nodal officer");
		institute.save(application); 
		return reg.getApplicationstatus();
}
	
	@PutMapping("/ApprovalbyInstitute/{aadhar}")
	public String findByAadharNo(@PathVariable(value="aadhar") String aadhar, @RequestBody Boolean b) {
		Optional<ScholarshipApplication> sa = sar.findByAadhar(aadhar);
		ScholarshipApplication application = sa.get(); 
		application.setFinalStatus("APPROVED BY INSTITUTE");
		sar.save(application);
		String var = application.getFinalStatus();
		return var;
		
	}
	

	
	
}
	
	