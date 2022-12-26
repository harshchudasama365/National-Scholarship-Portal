import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthenticationService } from '../authentication.service';
import { ministry } from '../ministry';
@Component({
  selector: 'app-ministry',
  templateUrl: './ministry.component.html',
  styleUrls: ['./ministry.component.css']
})
export class MinistryComponent implements OnInit {
  username = ''
  password = ''
 

  constructor(private router:Router,private loginService:AuthenticationService) { }

  ngOnInit(): void {
  }
  form=new FormGroup({
    'username':new FormControl('',Validators.required),
    'password':new FormControl('',Validators.required),
  })
  ministry:ministry=new ministry();
  checkLogin() {
      this.ministry=this.form.value;
      console.log(this.form.value)
      console.log(this.ministry)
    let ministry={
      "username":this.username,
      "password":this.password
    }
    this.loginService.ministrylogin(ministry).subscribe((response) => {
      console.log(response);
      if(response)
      {
        sessionStorage.setItem('username', this.username)
        
        this.router.navigate(['/ministryhome']);
        
      }
      else{
        alert("Invalid Login");
      }
    });
  }
}
