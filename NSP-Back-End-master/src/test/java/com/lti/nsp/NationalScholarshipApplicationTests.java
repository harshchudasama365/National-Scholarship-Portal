package com.lti.nsp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import com.lti.nsp.controller.InstituteController;
import com.lti.nsp.controller.MinistryController;
import com.lti.nsp.controller.NodalOfficerController;
import com.lti.nsp.controller.StudentController;
import com.lti.nsp.entity.InstituteDetail;
import com.lti.nsp.entity.InstituteLogin;
import com.lti.nsp.entity.Ministry;
import com.lti.nsp.entity.Ministrylogin;
import com.lti.nsp.entity.NodalOfficer;
import com.lti.nsp.entity.NodalOfficerLogin;
import com.lti.nsp.entity.studentlogin;
import com.lti.nsp.entity.studentreg;


@SpringBootTest(classes=NationalScholarshipApplication.class)
@TestMethodOrder(OrderAnnotation.class)
class NationalScholarshipApplicationTests {
	
    @Autowired
	private InstituteController instCtrl;
	
    @Autowired
	private NodalOfficerController nodCtrl;
	
    @Autowired
    private StudentController studCtrl;
    
    @Autowired
    private MinistryController miniCtrl;
    
    
	@Test
	@Order(1)
	public void testInstituteRegister() {
		InstituteDetail instMod=new InstituteDetail();
		instMod.setAddressLine1("North street");
		instMod.setAddressLine2("some area");
		instMod.setAffiUnivState("state");
		instMod.setAffilatedUBName("45");
		instMod.setCity("mumbai");
		instMod.setDisecode(849);
		instMod.setInstiCode("ABCD");
		instMod.setEmailid("ssp@gmail.com");
		instMod.setPassword("1234");
		
		
		InstituteDetail res= instCtrl.addInstitute(instMod);
		assertNotNull(res);
	}

	
	@Test
	@Order(2)
	public void testAllInstituteDetail() {
		System.out.println(instCtrl.getAllInstituteDetail());
		assertNotNull(instCtrl.getAllInstituteDetail());
	}
	
	
	@Test
	@Order(3)
	public void testvalidateInstituteLogin() {
		
		InstituteLogin instMod=new InstituteLogin();
		instMod.setEmailid("ssp@gmail.com");
		instMod.setPassword("1234");
		assertEquals(instCtrl.validateUser(instMod),true);

	}
	
	
	@Test
	@Order(4)
	public void testGetInstituteAppliations() {
		assertNotEquals((nodCtrl.getAllInstitutes()).size(),0);
	}

	@Test
	@Order(5)
	public void testRegisterstudent() {
		studentreg stuMod=new studentreg();
		stuMod.setAadharNumber("380183206828");
		stuMod.setName("siva");
		stuMod.setEmail("ss@gmail.com");
		stuMod.setGender("male");
		stuMod.setPassword("1234");
		studentreg res= studCtrl.createStudent(stuMod);
		assertNotNull(res);

	}
	@Test
	@Order(6)
    public void testStudentLogin(){
		studentlogin stuMod=new studentlogin();
		stuMod.setAadharNumber("380183206828");
		stuMod.setPassword("1234");
		boolean res=studCtrl.validateUser(stuMod);
		assertEquals(true,res);
	}
    @Test
    @Order(7)
	public void teststudentdetails()
	{
    	assertNotEquals((studCtrl.studentdetails()).size(),0);
	}
    
    @Test
    @Order(8)
    public void registerStateNodal() {
    	NodalOfficer nodalOfficer = new NodalOfficer();
    	nodalOfficer.setUsername("nodal123");
    	nodalOfficer.setName("tnodal");
    	nodalOfficer.setPassword("1234");
    	assertNotNull(nodCtrl.createNodalOfficer(nodalOfficer));
    }
    
    @Test
	@Order(9)
    public void testNodalLogin(){
		NodalOfficerLogin nodMod=new NodalOfficerLogin();
		nodMod.setUsername("nodal123");
		nodMod.setPassword("1234");
		assertEquals(nodCtrl.nodalLoginCheck(nodMod),true);
	}
    
    @Test
    @Order(10)
    public void registerMinistry() {
    	Ministry ministry = new Ministry();
    	ministry.setUsername("ministry");
    	ministry.setName("EM");
    	ministry.setPassword("1234");
    	assertNotNull(miniCtrl.addMinistry(ministry));
    }
  
	@Test
	@Order(11)
    public void testMinistryLogin(){
		Ministrylogin miniMod=new Ministrylogin();
		miniMod.setUsername("ministry");
		miniMod.setPassword("1234");
		assertEquals(miniCtrl.ministryLoginCheck(miniMod),true);
	}
	
	@Test
	@Order(12)
	public void testGetNodalDetails() {
		assertNotEquals((nodCtrl.nodalDetails()).size(),0);
	}
}