import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router} from '@angular/router';
import { ScholarshipapplicationService } from '../scholarshipapplication.service';
import { applicationDetails } from '../scholarshipapplicationdetails';

@Component({
  selector: 'app-schupdate',
  templateUrl: './schupdate.component.html',
  styleUrls: ['./schupdate.component.css']
})
export class SchupdateComponent implements OnInit {
  optionValue:any;
  schemeValue:any;
  form:FormGroup;
  username:any;
  application:any;
  constructor(private myrouter:Router,private bas:ScholarshipapplicationService,fb:FormBuilder) {
    this.form = fb.group({
      'aadhar':['',Validators.required,Validators.min(100000000000), Validators.max(9999999999999)],
      'phoneNumber':['',Validators.required,Validators.min(10000000000000), Validators.max(999999999999999)],
      'name':['',Validators.required],
      'dob':['',Validators.required],
      'email':['',Validators.compose([Validators.email, Validators.required])],
      'religion':['',Validators.required],
      'community':['',Validators.required],
      'fatherName':['',Validators.required],
      'motherName':['',Validators.required],
      'annualIncome':['',Validators.required],
      'institution':['',Validators.required],
      'presentClass':['',Validators.required],
      'presentClassYear':['',Validators.required],
      'modeOfStudy':['',Validators.required],
      'classStartDate':['',Validators.required],
      'university':['',Validators.required],
      'previousClass':['',Validators.required],
      'previousClassYear':['',Validators.required],
      'previousPercentage':['',Validators.required],
      'tenthRollNo':['',Validators.required],
      'tenthBoard':['',Validators.required],
      'tenthYear':['',Validators.required],
      'tenthPercentage':['',Validators.required],
      'twelthRollNo':['',Validators.required],
      'twelthBoard':['',Validators.required],
      'twelthYear':['',Validators.required],
      'twelthPercentage':['',Validators.required],
      'admissionFee':['',Validators.required],
      'tuitionFee':['',Validators.required],
      'otherFee':['',Validators.required],
      'isDisabled':['',Validators.required],
      'typeofDisability':['',Validators.required],
      'disabilityPercenage':['',Validators.required],
      'maritalStatus':['',Validators.required],
      'parentsProfession':['',Validators.required],
      'state':['',Validators.required],
      'district':['',Validators.required],
      'taluk':['',Validators.required],
      'houseNo':['',Validators.required],
      'streetNo':['',Validators.required],
      'pincode':['',Validators.required],
      'gender':['',Validators.required],
      'scheme':['',Validators.required],
      'finalStatus':['',Validators.required],
      'studentDocuments':['',Validators.required]
    })
   }

   onFileChange(event) {
  
    if (event.target.files.length > 0) {
      let file= event.target.files[0];
        this.form.patchValue({
          'studentDocuments':file
        });
      }
     
    }
  
  
  ngOnInit(): void {
    this.username=sessionStorage.getItem('aadharNumber');
    console.log(this.username);
    this.bas.getStudentByAadhar(this.username).subscribe(
      (data)=>{
        console.log(data);
        this.application=data;
      },
      (error)=>
      {
        console.log(error);
      }
    )
  }


applicationDetails:applicationDetails = new applicationDetails();

   updatescholarshipDetails(basicDetailsForm:any){

    this.applicationDetails=basicDetailsForm.value;

  
    this.bas.updateScholarship(this.applicationDetails).subscribe(
      (data)=>{

        const formData = new FormData();
        formData.append("aadhar",this.applicationDetails.aadhar);
        formData.append("studentDocuments",this.form.controls['studentDocuments'].value);
        
        alert("Scholarship Application Updated!")
        this.myrouter.navigate(['/studenthome']);
      },
      (error)=>{
         console.log(error)
      }
      )
   }

}
