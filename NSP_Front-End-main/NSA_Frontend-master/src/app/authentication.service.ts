import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ministry } from './ministry';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor(private http:HttpClient) { }


  login(student:any):Observable<any>
  {
    return this.http.post("http://localhost:9001/studentlogin",student);
  }
  nodallogin(nodal:any):Observable<any>
  {
    return this.http.post("http://localhost:9001/nodallogin",nodal);
  }

  ministrylogin(ministry:any):Observable<any>
  {
    return this.http.post("http://localhost:9001/ministrylogin",ministry);
  }

  institutelogin(institute:any):Observable<any>
  {
    return this.http.post("http://localhost:9001/institutelogin",institute);
  }

  isUserLoggedIn() {
    let user = sessionStorage.getItem('email')
    console.log(!(user === null))
    return !(user === null)
  }
 
  logOut() {
    sessionStorage.removeItem('email')
  }
}