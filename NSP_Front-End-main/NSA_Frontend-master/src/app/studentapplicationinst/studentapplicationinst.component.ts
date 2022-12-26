import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StudentapplicationsService } from '../studentapplications.service';

@Component({
  selector: 'app-studentapplicationinst',
  templateUrl: './studentapplicationinst.component.html',
  styleUrls: ['./studentapplicationinst.component.css']
})
export class StudentapplicationinstComponent implements OnInit {

  Studentapplication:any
  emailid:any;
  file:any;

  constructor(private stu:StudentapplicationsService,private myRouter:Router) { }

  ngOnInit(): void {
    this.emailid=sessionStorage.getItem("emailid");

    this.stu.getInstituteApplicationList(this.emailid).subscribe(data=>{
      this.Studentapplication = data;
      this.Studentapplication.forEach(element => {
        console.log(element.finalStatus);        
      });
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
    this.stu.updateStatusIns(aadhar,newData)
      .subscribe((data: any) => alert("approved"),
        (error: any) => console.log(error));
        alert("Student Approved")
        this.myRouter.navigate(['/institutionhome']);
        
  }

  remove(aadhar:any){
    
    this.stu.deleteStudent(aadhar).subscribe(
      data => {
        console.log(data);
      },
      error => console.log(error));
      
  }


}
function saveAs(d: any, file: any) {
  throw new Error('Function not implemented.');
}

