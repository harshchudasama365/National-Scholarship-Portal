import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { InstituteapplicationService } from '../instituteapplication.service';
@Component({
  selector: 'app-institutefinalapproval',
  templateUrl: './institutefinalapproval.component.html',
  styleUrls: ['./institutefinalapproval.component.css']
})
export class InstitutefinalapprovalComponent implements OnInit {
  instituteapplication:any

  constructor(private inst:InstituteapplicationService,private myRouter:Router) { }

  ngOnInit(): void {
    this.instituteapplication=this.inst.getnodalapprovedList();
  }

 ministerApproval(instiCode:any){
  let newData:boolean = true;
    this.inst.updateFinalStatus(instiCode,newData)
      .subscribe((data: any) => console.log(data),
        (error: any) => console.log(error));
        alert("APPROVED BY MINISTRY")
      
 }
  
  ministerReject(instiCode:any){
    
    this.inst.rejectMinisterInstitute(instiCode).subscribe(
      (data: any) => {
        console.log(data);
      },
      (error: any) => console.log(error));
      alert("REJECTED BY MINISTRY")
    
  }

  


}