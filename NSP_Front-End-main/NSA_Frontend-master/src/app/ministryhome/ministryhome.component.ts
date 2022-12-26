import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MinistryhomeService } from '../ministryhome.service';

@Component({
  selector: 'app-ministryhome',
  templateUrl: './ministryhome.component.html',
  styleUrls: ['./ministryhome.component.css']
})
export class MinistryhomeComponent implements OnInit {


  constructor(private myhttp:HttpClient,private min:MinistryhomeService,private myRouter:Router) { 

  }

  username:any;
  ministerData : any;

  ngOnInit(): void {
    this.username=sessionStorage.getItem("username");
    console.log(this.username);
    this.min.ShowDetails(this.username).subscribe(
      (data)=>{
        console.log(data);
        this.ministerData=data;
      },
      (error)=>{
        console.log(error);
      }
    )
  }

}

