import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../authentication.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { student } from '../student';
@Component({
  selector: 'app-studentlogin',
  templateUrl: './studentlogin.component.html',
  styleUrls: ['./studentlogin.component.css']
})
export class StudentloginComponent implements OnInit {
  aadharNumber = ''
  password = ''

  constructor(private router:Router,private loginService:AuthenticationService) { }

  ngOnInit(): void {
  }
  form=new FormGroup({
    'aadharNumber':new FormControl('',Validators.required),
    'password':new FormControl('',Validators.required),
  })
  student:student=new student();
  checkLogin() {
      this.student=this.form.value;
      console.log(this.form.value)
      console.log(this.student)
    let student={
      "aadharNumber":this.aadharNumber,
      "password":this.password
    }

    this.loginService.login(student).subscribe((response) => {
      console.log(response);
      if(response)
      {
        sessionStorage.setItem('aadharNumber', this.aadharNumber)
        alert("Login Successful");
        this.router.navigate(['/studenthome']);
        
      }
      else{
        alert("bad credentials");
      }
      
    });
  }
}