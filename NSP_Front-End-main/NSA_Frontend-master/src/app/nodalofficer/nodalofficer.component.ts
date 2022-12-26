import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../authentication.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { nodal } from '../nodal'

@Component({
  selector: 'app-nodalofficer',
  templateUrl: './nodalofficer.component.html',
  styleUrls: ['./nodalofficer.component.css']
})
export class NodalofficerComponent implements OnInit {

  username = ''
  password = ''

  constructor(private router:Router,private loginService:AuthenticationService) { }

  ngOnInit(): void {
  }

  form=new FormGroup({
    'username':new FormControl('',Validators.compose([Validators.required])),
    'password':new FormControl('',Validators.required),
  })

  nodal:nodal=new nodal();
  checkLogin() {
      this.nodal=this.form.value;
      console.log(this.form.value)
      console.log(this.nodal)
    let nodal={
      "username":this.username,
      "password":this.password
    }

    this.loginService.nodallogin(nodal).subscribe((response) => {
      console.log(response);
      if(response)
      {
        sessionStorage.setItem('username', this.username)
        this.router.navigate(['/nodalhome']);
        alert("login success !!");
       
      }
      else{
      alert("invalid login !!");
          }
    });
  }

}
