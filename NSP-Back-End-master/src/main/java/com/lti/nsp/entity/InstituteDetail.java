package com.lti.nsp.entity;
import javax.persistence.Entity;
import javax.persistence.Id;


import javax.persistence.Table;
@Entity
@Table(name = "institutedetails")
public class InstituteDetail {
	

		@Id
		String instiCode;
		String instiCat ;
		String name;
		String inststate;
		String instdist;		
		String emailid;
		long disecode;
		String location;
		String institutionType;
		String affiUnivState;
		String affilatedUBName;
		String yearFWhichAdmiSt;
		String password;
		String addressLine1;
		String addressLine2;
		String city;
		String state;
		String district;
		long pincode;
		String prinName;
		long telephone;
		String applicationStatus = "pending approval";
		
		
		public String getInstiCat() {
			return instiCat;
		}
		public void setInstiCat(String instiCat) {
			this.instiCat = instiCat;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getInststate() {
			return inststate;
		}
		public void setInststate(String inststate) {
			this.inststate = inststate;
		}
		public String getInstdist() {
			return instdist;
		}
		public void setInstdist(String instdist) {
			this.instdist = instdist;
		}
		public String getInstiCode() {
			return instiCode;
		}
		public void setInstiCode(String instiCode) {
			this.instiCode = instiCode;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public long getDisecode() {
			return disecode;
		}
		public void setDisecode(long disecode) {
			this.disecode = disecode;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getInstitutionType() {
			return institutionType;
		}
		public void setInstitutionType(String institutionType) {
			this.institutionType = institutionType;
		}
		public String getAffiUnivState() {
			return affiUnivState;
		}
		public void setAffiUnivState(String affiUnivState) {
			this.affiUnivState = affiUnivState;
		}
		public String getAffilatedUBName() {
			return affilatedUBName;
		}
		public void setAffilatedUBName(String affilatedUBName) {
			this.affilatedUBName = affilatedUBName;
		}
		public String getYearFWhichAdmiSt() {
			return yearFWhichAdmiSt;
		}
		public void setYearFWhichAdmiSt(String yearFWhichAdmiSt) {
			this.yearFWhichAdmiSt = yearFWhichAdmiSt;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getAddressLine1() {
			return addressLine1;
		}
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		public String getAddressLine2() {
			return addressLine2;
		}
		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public long getPincode() {
			return pincode;
		}
		public void setPincode(long pincode) {
			this.pincode = pincode;
		}
		public String getPrinName() {
			return prinName;
		}
		public void setPrinName(String prinName) {
			this.prinName = prinName;
		}
		public long getTelephone() {
			return telephone;
		}
		public void setTelephone(long telephone) {
			this.telephone = telephone;
		}
		public String getApplication_status() {
			return applicationStatus;
		}
		public void setApplication_status(String applicationStatus) {
			this.applicationStatus = applicationStatus;
		}
		public InstituteDetail() {
			super();
		}
		public InstituteDetail(String instiCat, String name, String inststate, String instdist, String instiCode,
				String emailid, long disecode, String location, String institutionType, String affiUnivState,
				String affilatedUBName, String yearFWhichAdmiSt, String password, String addressLine1,
				String addressLine2, String city, String state, String district, long pincode, String prinName,
				long telephone, String application_status) {
			super();
			this.instiCat = instiCat;
			this.name = name;
			this.inststate = inststate;
			this.instdist = instdist;
			this.instiCode = instiCode;
			this.emailid = emailid;
			this.disecode = disecode;
			this.location = location;
			this.institutionType = institutionType;
			this.affiUnivState = affiUnivState;
			this.affilatedUBName = affilatedUBName;
			this.yearFWhichAdmiSt = yearFWhichAdmiSt;
			this.password = password;
			this.addressLine1 = addressLine1;
			this.addressLine2 = addressLine2;
			this.city = city;
			this.state = state;
			this.district = district;
			this.pincode = pincode;
			this.prinName = prinName;
			this.telephone = telephone;
			this.applicationStatus = applicationStatus;
			
		}
		
		
		
		
		
	   

}
