package com.lti.nsp.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.lti.nsp.entity.*;
import com.lti.nsp.repository.*;
import com.lti.nsp.service.StudentRecordService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class StudentController {

	@Autowired
	StudentRecordService service;
	
	@Autowired
	StudentRepository stu;
	
	
	
	//register a student
	@PostMapping("/studentregister") //working
	public studentreg createStudent(@RequestBody studentreg s) {
		service.addStudent(s);
		return s;
	}
	
	@PutMapping("/updatestudent") //working
	public studentreg updateStudent(@RequestBody studentreg s) {
		service.updateStd(s);
		return s;
	}
	
	//get all student details
	@GetMapping("/studentdetails")
	public List<studentreg> studentdetails(){
		List<studentreg> ls = stu.findAll();
		return ls;
	}
  
	//student login validation
	@PostMapping("/studentlogin")
	public boolean validateUser(@RequestBody studentlogin sl) {
		service.credsUsed(sl);
		String a = sl.getAadharNumber();
		String p = sl.getPassword();
		List<studentreg> ls = stu.findAll();
		for(studentreg s : ls) {
			if(s.getAadharNumber().equals(a) && s.getPassword().equals(p)) {
				return true;
			}
		}
		return false ;
	}
	
	//find student by their aadhar
	@GetMapping("/status/studenthome/{aadharNumber}")
	public studentreg studenthomedetails(@PathVariable  String aadharNumber) {
		studentreg ls = stu.findByAadharNumber(aadharNumber);
		return ls;
	}
	
	
}
