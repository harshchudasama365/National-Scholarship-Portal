import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class InstituteapplicationsService {

  // restURL: string;
  constructor(private myhttp:HttpClient) {
    // this.restURL="http://localhost:8989/"
  }
  // getInstitutesList(): Observable<any> {
  //   return this.myhttp.get(`${this.restURL}instituteapplications`);
  // }
}
