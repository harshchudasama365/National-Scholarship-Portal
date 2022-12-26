package com.lti.nsp.service;
import java.util.*;

import com.lti.nsp.entity.*;

public interface StudentRecordService {

	public studentreg addStudent(studentreg student);
	
	public studentreg updateStd(studentreg student);
	
	public studentreg findStudent(String aadharNumber);
	
	public studentlogin credsUsed(studentlogin sl);
	
}
