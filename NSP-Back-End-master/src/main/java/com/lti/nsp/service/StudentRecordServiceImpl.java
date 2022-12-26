package com.lti.nsp.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.nsp.dao.*;
import com.lti.nsp.entity.*;
import com.lti.nsp.repository.StudentLoginRepository;
import com.lti.nsp.repository.StudentRepository;

@Service("studentrecordservice")
public class StudentRecordServiceImpl implements StudentRecordService{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	@Transactional
	public studentreg addStudent(studentreg student) {
		System.out.println("Inside Service Layer");
	      return studentRepo.save(student);
	}
	
	
	@Autowired
	StudentRecordDAO dao;
	
	@Override
	@Transactional
	public studentreg findStudent(String aadharNumber) {
		return dao.findStudent(aadharNumber);
	}
	
	@Autowired
	StudentLoginRepository studlogin;
	
	public studentlogin credsUsed(studentlogin sl) {
		System.out.println("login service layer");
		return studlogin.save(sl);
	}
	
	@Override
	@Transactional
	public studentreg updateStd(studentreg student) {
		return studentRepo.save(student);
	}
	
}
