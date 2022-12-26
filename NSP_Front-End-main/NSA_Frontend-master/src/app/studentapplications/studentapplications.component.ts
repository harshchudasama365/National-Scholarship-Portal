import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {  saveAs } from 'file-saver'
import { StudentapplicationsService } from '../studentapplications.service';

@Component({
  selector: 'app-studentapplications',
  templateUrl: './studentapplications.component.html',
  styleUrls: ['./studentapplications.component.css']
})
export class StudentapplicationsComponent implements OnInit {

  Studentapplication:any
  ShowDetails:any;
  file:any;
  constructor(private stu:StudentapplicationsService,private myRouter:Router) { }

  ngOnInit(): void {
    this.stu.instApproved().subscribe(data=>{
      this.Studentapplication = data;
      this.stu.getStudentDoc().subscribe(d=>{
        this.file = d[0].studentDocuments;
      });
    });
   
  }

  download(aadhar:any){
    this.stu.downloadFile(aadhar,this.file).subscribe((d)=>{
      saveAs(d,this.file);
    })
  }
  
  approve(aadhar:any){
    let newData:boolean = true;
    this.stu.updateStatus(aadhar,newData)
      .subscribe((data: any) => alert("approved"),
        (error: any) => console.log(error));
        alert("APPLICATION APPROVED BY NODAL OFFICERY");
        this.myRouter.navigate(['/studentapplications'])
        
  }

  remove(aadhar:any){
    
    this.stu.deleteStudent(aadhar).subscribe(
      data => {
        console.log(data);
      },
      error => console.log(error));
      alert("APPLICATION APPROVED BY NODAL OFFICER");
        this.myRouter.navigate(['/studentapplications'])
      
  }

 

}
