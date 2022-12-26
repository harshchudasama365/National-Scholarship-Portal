import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { student } from '../student';
import { StudentregistrationService } from '../studentregistration.service';

@Component({
  selector: 'app-regupdate',
  templateUrl: './regupdate.component.html',
  styleUrls: ['./regupdate.component.css']
})
export class RegupdateComponent implements OnInit {

  constructor(private stu:StudentregistrationService, myHttp:HttpClient , private router:Router)  { }

  student:student = new student();
  username:any;

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
  form=new FormGroup({
    'stateofDomicile':new FormControl('',Validators.required),
    'district':new FormControl('',Validators.required),
    'name':new FormControl('',Validators.required),
    'dateOfBirth':new FormControl('',Validators.required),
    'gender':new FormControl('',Validators.required),
    'mobileNumber':new FormControl('',[Validators.required,,Validators.min(100000000000), Validators.max(9999999999999)]),
    'email':new FormControl('',Validators.compose([Validators.email, Validators.required])),
    'institutecode':new FormControl('',Validators.required),
    'aadharNumber':new FormControl('',[Validators.required,Validators.min(100000000000), Validators.max(9999999999999)
     ]),
    'bankifsccode':new FormControl('',Validators.required),
    'accountnumber':new FormControl('',Validators.required),
    'bankname':new FormControl('',Validators.required),
    'password':new FormControl('',Validators.required),
  });

  updateStudent()
  {
      this.student=this.form.value;

      this.stu.updateStd(this.student).subscribe(
        (data)=>{
          console.log(data);
          alert("Student Details Updated!");
          this.router.navigate(['/studenthome']);
                  },
        (error)=>
        {
          console.log(error)
        }
      )
  }
  
}
