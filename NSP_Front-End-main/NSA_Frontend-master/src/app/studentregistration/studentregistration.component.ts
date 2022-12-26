import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Institution } from '../institution';
import { InstitutionregistrationService } from '../institutionregistration.service';
import { student } from '../student';
import { StudentregistrationService } from '../studentregistration.service';
import { Router} from '@angular/router';

@Component({
  selector: 'app-studentregistration',
  templateUrl: './studentregistration.component.html',
  styleUrls: ['./studentregistration.component.css']
})
export class StudentregistrationComponent implements OnInit {

  constructor(private stu:StudentregistrationService, myHttp:HttpClient , private router:Router)  { }



  ngOnInit(): void {

  }
  form=new FormGroup({
    'stateofDomicile':new FormControl('',Validators.required),
    'district':new FormControl('',Validators.required),
    'name':new FormControl('',Validators.required),
    'dateOfBirth':new FormControl('',Validators.required),
    'gender':new FormControl('',Validators.required),
    'mobileNumber':new FormControl('',[Validators.required]),
    'email':new FormControl('',Validators.compose([Validators.email, Validators.required])),
    'institutecode':new FormControl('',Validators.required),
    'aadharNumber':new FormControl('',[Validators.required,Validators.min(100000000000), Validators.max(9999999999999)
     ]),
    'bankifsccode':new FormControl('',Validators.required),
    'accountnumber':new FormControl('',Validators.required),
    'bankname':new FormControl('',Validators.required),
    'password':new FormControl('',Validators.required),
  });
  student:student=new student();
  student2:student=new student();
  saveStudent()
  {
    //console.log(this.validate())
      this.student=this.form.value;
      this.stu.registerStudent(this.student).subscribe(
        (data)=>{
          console.log(data);
          alert("Registration done");
          this.router.navigate(['/home']);
                  },
        (error)=>
        {
          console.log(error)
        }
      )
}

  validate() :any{
    let aadharRegEx: RegExp = /^[2-9]{1}[0-9]{11}$/;
    let mobileRegEx: RegExp = /^[7-9]{1}[0-9]{9}$/;

    this.stu.getStudentDetails(this.form.value.aadharNumber).subscribe(
      (data)=>{
        console.log(data);
        this.student2=data;
        console.log(this.student2 != null)
        if(this.student2 != null)
        {
          alert("Student with Aadhar already exists!");
          //console.log(this.student2 != null)
          this.router.navigate(['/home']);
        }
        else if((aadharRegEx.test(this.form.value.aadharNumber))&&(mobileRegEx.test(this.form.value.mobileNumber))){
          this.saveStudent();
        }
        else{
        if(!mobileRegEx.test(this.form.value.mobileNumber)){
          alert("INVALID MOBILE NUMBER")
          console.log(this.form.value)
        }

        if(!aadharRegEx.test(this.form.value.aadharNumber)){
            alert("INVALID AADHAR")
      }
    }
  })
}
  
}