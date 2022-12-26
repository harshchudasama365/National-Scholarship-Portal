import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { InstitutionhomeService } from '../institutionhome.service';

@Component({
  selector: 'app-institutionhome',
  templateUrl: './institutionhome.component.html',
  styleUrls: ['./institutionhome.component.css']
})
export class InstitutionhomeComponent implements OnInit {

  constructor(private insti:InstitutionhomeService,private myRouter:Router) { }
  emailid:any;
  instituteData:any;

  ngOnInit(): void {
    this.emailid=sessionStorage.getItem("emailid");
    this.insti.ShowDetails(this.emailid).subscribe(
      (data)=>{
        console.log(data);
        this.instituteData=data;
      },
      (error)=>
      {
        console.log(error);
      }
    )
    }

    

}
