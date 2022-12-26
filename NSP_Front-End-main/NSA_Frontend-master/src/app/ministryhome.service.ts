import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MinistryhomeService {

  constructor(private myhttp:HttpClient) { }
  restURL:string="http://localhost:9001/"
  ShowDetails(username:String)
  {
    return this.myhttp.get(`${this.restURL}ministerhome/`+`${username}`);
  }
}
