import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class InstitutionhomeService {

  constructor(private myhttp:HttpClient) { }
  restURL:string="http://localhost:9001/"

  ShowDetails(emailid:String)
  {
    return this.myhttp.get(`${this.restURL}institutes/`+`${emailid}`);
  }

  showInstDetails(id:String){
    return this.myhttp.get(this.restURL+'institutes')
  }
}
