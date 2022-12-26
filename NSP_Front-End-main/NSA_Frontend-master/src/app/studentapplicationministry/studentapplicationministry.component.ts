import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StudentapplicationsService } from '../studentapplications.service';

@Component({
  selector: 'app-studentapplicationministry',
  templateUrl: './studentapplicationministry.component.html',
  styleUrls: ['./studentapplicationministry.component.css']
})
export class StudentapplicationministryComponent implements OnInit {

  Studentapplication:any
  ShowDetails:any;
  constructor(private stu:StudentapplicationsService,private myRouter:Router) {
  }

  ngOnInit(): void {
    this.Studentapplication=this.stu.getFinalApplicationList();
  }
  
  finalApprove(aadhar:any){
    let newData:boolean = true;
    this.stu.updateFinalStatus(aadhar,newData)
      .subscribe((data: any) => console.log(data),
        (error: any) => console.log(error));
        alert("APPLICATION APPROVED BY MINISTRY");
        this.myRouter.navigate(['/ministryhome'])
  }

  reject(aadhar:any){
    
    this.stu.deleteMinistryStudent(aadhar).subscribe(
      data => {
        console.log(data);
      },
      error => console.log(error));
      alert("APPLICATION REJECTED BY MINISTRY");
        this.myRouter.navigate(['/ministryhome'])
    }

  
}
