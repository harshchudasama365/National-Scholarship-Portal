import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ScholarshipapplicationService } from '../scholarshipapplication.service';
import { applicationDetails } from '../scholarshipapplicationdetails';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { student } from '../student';
import { StudentregistrationComponent } from '../studentregistration/studentregistration.component';
import { StudentregistrationService } from '../studentregistration.service';

@Component({
  selector: 'app-scholarapplication',
  templateUrl: './scholarapplication.component.html',
  styleUrls: ['./scholarapplication.component.css']
})
export class ScholarapplicationComponent implements OnInit {
  optionValue:any;
  schemeValue:any;
  form:FormGroup;
  username:any;
  student: student = new student();
  constructor(private myrouter:Router,private bas:ScholarshipapplicationService,fb:FormBuilder,private stu:StudentregistrationService) {
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
    this.stu.getStudentDetails(this.username).subscribe(
      (data)=>{
        console.log(data);
        this.student=data;
      },
      (error)=>
      {
        console.log(error);
      }
    )
  }


  //form=new FormGroup({
    
  //});
  

applicationDetails:applicationDetails = new applicationDetails();

   savescholarshipDetails(basicDetailsForm:any){

    this.applicationDetails=basicDetailsForm.value;

  
    this.bas.addScholarship(this.applicationDetails).subscribe(
      (data)=>{

        const formData = new FormData();
        //formData.append("aadhar",this.applicationDetails.aadhar);
        formData.append("studentDocuments",this.form.controls['studentDocuments'].value);
        console.log(formData)
       
        
        this.bas.addDocuments(formData).subscribe(data=>{
          console.log(data);
        });

      
        alert("Scholarship application submitted")
        this.myrouter.navigate(['/studenthome']);
      },
      (error)=>{
         console.log(error)
      }
      )
   }

}

// student:student=new student();
// saveStudent()
// {
//     this.student=this.form.value;
//     console.log(this.form.value)
//     console.log(this.student)

//     this.stu.registerStudent(this.student).subscribe(
//       (data)=>{
//         console.log(data);
//         this.router.navigate(['/home']);
//                 },
//       (error)=>
//       {
//         console.log(error)
//       }
//     )
// }

// OnClickFunction(){
//  alert("Registration done");
// }