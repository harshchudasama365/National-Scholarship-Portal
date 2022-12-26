import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class NodalhomeService {

  constructor(private http : HttpClient) { }

  restURL:string="http://localhost:9001/"
  showDetails(username:String){
    return this.http.get(`${this.restURL}nodalhome/`+`${username}`)
  }

  instApproved(username:String){
    return this.http.get(`${this.restURL}nodalhome/`+`${username}`)
  }
}
