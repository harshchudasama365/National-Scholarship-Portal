import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NodalhomeService } from '../nodalhome.service';

@Component({
  selector: 'app-nodalhome',
  templateUrl: './nodalhome.component.html',
  styleUrls: ['./nodalhome.component.css']
})
export class NodalhomeComponent implements OnInit {
  
  username:any;
  nodalData:any;
  constructor(private nod:NodalhomeService, private myrouter:Router) { }

  ngOnInit(): void {
    this.username=sessionStorage.getItem("username");
    this.nod.showDetails(this.username).subscribe(
      (data)=>{
        console.log(data);
        this.nodalData = data;
      },
      (error)=>
      {
        console.log(error);
      }
    )
  }

}
