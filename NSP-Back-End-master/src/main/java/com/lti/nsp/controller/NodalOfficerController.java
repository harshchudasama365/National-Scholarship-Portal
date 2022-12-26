package com.lti.nsp.controller;

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
import com.lti.nsp.entity.NodalOfficer;
import com.lti.nsp.entity.NodalOfficerLogin;
import com.lti.nsp.entity.ScholarshipApplication;
import com.lti.nsp.repository.InstituteDetailsRepository;
import com.lti.nsp.repository.NodalOfficerRepository;
import com.lti.nsp.repository.ScholarshipApplicationRepository;
import com.lti.nsp.service.NodalOfficerService;

import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class NodalOfficerController {

	@Autowired
	private NodalOfficerService nodal;
	
	@Autowired
	private InstituteDetailsRepository institute;
	
	@Autowired
	private NodalOfficerRepository nod;
	
	
	
	@Autowired
	private ScholarshipApplicationRepository sar;
	
	//add nodal officer
	@PostMapping("/nodalofficer")
	public NodalOfficer createNodalOfficer(@Valid @RequestBody NodalOfficer nodal1) {
		return nodal.addNodal(nodal1);
	}
	
	
	//get all nodal officers
	@GetMapping("/nodalofficerdetails")
	public List<NodalOfficer> nodalDetails(){
		List<NodalOfficer> ls = nod.findAll();
		return ls;
	}
	
	//nodal login validation
	@PostMapping("/nodallogin")
	public boolean nodalLoginCheck(@Valid @RequestBody NodalOfficerLogin n) {
		String username = n.getUsername();
		String password = n.getPassword();
		List<NodalOfficer> ls = nod.findAll();
		for(NodalOfficer a : ls) {
			if((username.equals(a.getUsername())) && (password.equals(a.getPassword()))){
				return true;
			}
		}
		return false;
	}
	
	//approved by Institure officer and forwarded to Nodal
		@GetMapping("/instituteapproved")
		public List<ScholarshipApplication> approvedbyInst(){
			List<ScholarshipApplication>ls = sar.findByFinalStatus("APPROVED BY INSTITUTE");
			return ls;
		}
	
	//get institute details in nodal officer home page
	@GetMapping("/institutesinnodal")
	public List<InstituteDetail> getAllInstitutes(){
		return institute.findAll();
	}
	
	//get institute details by institute code and finally approved by nodal officer
	@PutMapping("/institutionsapproval/{instiCode}")
	public void updateStatus(@PathVariable(value="instiCode") String instiCode, @RequestBody Boolean b) {
		Optional<InstituteDetail> i = institute.findByInstiCode(instiCode);
		InstituteDetail application = i.get(); 
		application.setApplication_status("APPROVED BY NODAL OFFICER");
		institute.save(application); 
	}
	
	//get institute details by institute code and finally rejected by nodal officer
	@DeleteMapping("/institutesnodal/{instiCode}")
	public void rejectbynodal(@PathVariable(value="instiCode") String instiCode) {
		Optional<InstituteDetail> entity = institute.findByInstiCode(instiCode);
		InstituteDetail i = entity.get();
		i.setApplication_status("REJECTED BY NODAL OFFICER");
		institute.save(i);
		//return "rejected";
	}
	
	//get nodal officer by their usernames
	@GetMapping("/nodalhome/{username}")
	public NodalOfficer getDetails(@PathVariable String username) {
		NodalOfficer nodal = nod.findByUsername(username);
				return nodal;
	}
	
	
	@PutMapping("/studentApproval/{aadhar}")
	public String findByAadharNo(@PathVariable(value="aadhar") String aadhar, @RequestBody Boolean b) {
		Optional<ScholarshipApplication> sa = sar.findByAadhar(aadhar);
		ScholarshipApplication application = sa.get(); 
		application.setFinalStatus("APPROVED BY NODAL OFFICER");
		sar.save(application);
		String var = application.getFinalStatus();
		return var;
		
	}
	
	@DeleteMapping("/studentApprovalDenied/{aadhar}")
	public String findByAadharrNo(@PathVariable(value="aadhar") String aadhar) {
		Optional<ScholarshipApplication> sa = sar.findByAadhar(aadhar);
		ScholarshipApplication application = sa.get(); 
		application.setFinalStatus("REJECTED BY NODAL OFFICER");
		sar.save(application);
		String var = application.getFinalStatus();
		return var;
		
	}
	
	
}
