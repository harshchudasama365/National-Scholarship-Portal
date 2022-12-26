package com.lti.nsp.dao;

import com.lti.nsp.entity.studentreg;

public interface StudentRecordDAO {

	
	studentreg findStudent(String aadharNumber);
}
