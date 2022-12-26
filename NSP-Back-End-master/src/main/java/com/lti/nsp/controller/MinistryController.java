package com.lti.nsp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.nsp.entity.InstituteDetail;
import com.lti.nsp.entity.Ministry;
import com.lti.nsp.entity.Ministrylogin;
import com.lti.nsp.entity.ScholarshipApplication;
import com.lti.nsp.repository.InstituteDetailsRepository;
import com.lti.nsp.repository.MinistryloginRepository;
import com.lti.nsp.repository.ScholarshipApplicationRepository;
import com.lti.nsp.service.MinistryloginServiceImpl;

@RestController  
@CrossOrigin(origins = "http://localhost:4200")
public class MinistryController {
	
	
	List<InstituteDetail> ls;
	@Autowired
	private MinistryloginServiceImpl ministry;
	
	@Autowired
	MinistryloginRepository mlr;
	
	@Autowired
	InstituteDetailsRepository institute;
	
	//add a minister
	@PostMapping("/ministry")
	public Ministry addMinistry(@Valid @RequestBody Ministry ministry1) {   //Ministry= type
		return ministry.addMinistry(ministry1);
	}

	//get all ministers
	@GetMapping("/ministrydetails")
	public List<Ministry> ministryDetails(){
		List<Ministry> ls = mlr.findAll();
		return ls;
	}
	
	//minister login validation
	@PostMapping("/ministrylogin")
	public boolean ministryLoginCheck(@Valid @RequestBody Ministrylogin n) {  //boolean: return type, Ministrylogin= type
		String username = n.getUsername();
		String password = n.getPassword();
		List<Ministry> ls = mlr.findAll(); //calls all the ministry login details
		for(Ministry a : ls) {
			if((username.equals(a.getUsername())) && (password.equals(a.getPassword()))){
				return true;
			}
		}
		return false;
	}
	
	
	//find minister by username
	@GetMapping("/ministerhome/{username}")
	public Ministry ministerDetails(@PathVariable String username) {
		Ministry m = mlr.findByUsername(username);
		return m;
	}
	
	//approved by nodal officer and forwarded to minister
	@GetMapping("/nodalapproved")
	public List<InstituteDetail> approvedInstitutes(){
		ls = institute.findByApplicationStatus("APPROVED BY NODAL OFFICER");
		return ls;
	}
	
	
	//get institute by institute code and finally approved by minister
	@PutMapping("/ministryinstitute/{instiCode}")
	public String grantInstituteApproval(@PathVariable(value="instiCode") String instiCode) {
		ls = institute.findByApplicationStatus("APPROVED BY NODAL OFFICER");
	//	InstituteDetail i = (InstituteDetail) institute.findByInstiCode(instiCode);
		for(InstituteDetail i : ls) {
			if(instiCode.equals(i.getInstiCode())) {
				i.setApplication_status("APPROVED BY MINISTRY");
				institute.save(i);
				break;
			}
		}
		return "APPROVED BY MINISTRY";
	}
	
	//get institute by institute code and finally rejected by minister
	@DeleteMapping("/ministryrejectinstitute/{instiCode}")
	public String rejectInstitution(@PathVariable(value="instiCode") String instiCode) {
		ls = institute.findByApplicationStatus("APPROVED BY NODAL OFFICER");
		for(InstituteDetail i : ls) {
			if(instiCode.equals(i.getInstiCode())) {
				i.setApplication_status("REJECTED BY MINISTRY");
				institute.save(i);
				break;
			}
		}
		return "REJECTED BY MINISTRY";
	}
	
	List<ScholarshipApplication> sa;
	
	@Autowired
	ScholarshipApplicationRepository sar;
		
	
	//
	@PutMapping("/ministrystudent/{aadhar}")
	public String grantStudentApproval(@PathVariable(value="aadhar") String aadhar, @RequestBody Boolean b) {
		sa = sar.findByFinalStatus("APPROVED BY NODAL OFFICER");
	//	InstituteDetail i = (InstituteDetail) institute.findByInstiCode(instiCode);
		for(ScholarshipApplication i : sa) {
			if(aadhar.equals(i.getAadhar())) {
				i.setFinalStatus("APPROVED BY MINISTRY");
				sar.save(i);
				break;
			}
		}
		return "APPROVED BY MINISTRY";
	}
	
	@GetMapping("/getministrystudent")
	public List<ScholarshipApplication> getStudents()
	{
		List<ScholarshipApplication> getStu = sar.findByFinalStatus("APPROVED BY NODAL OFFICER");
		return getStu;
	}
	
	@DeleteMapping("/ministryStudentDenied/{aadhar}")
	public String rejectStudent(@PathVariable(value="aadhar") String aadhar) {
		sa = sar.findByFinalStatus("APPROVED BY NODAL OFFICER");
		for(ScholarshipApplication i : sa) {
			if(aadhar.equals(i.getAadhar())) {
				i.setFinalStatus("REJECTED BY MINISTRY");
				sar.save(i);
				break;
			}
		}
		return "REJECTED BY MINISTRY";
	}
	
}
