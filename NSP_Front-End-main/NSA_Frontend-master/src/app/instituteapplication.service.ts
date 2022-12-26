import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class InstituteapplicationService {
  
  
  restURL: string;
  constructor(private http:HttpClient) {
      this.restURL="http://localhost:9001/"
  }
  getapplicationList(): any {
    return this.http.get(`${this.restURL}instituterecord`);
  }

  updateStatus(instiCode: any, newData: any) {
    return this.http.put(`${this.restURL}institutionsapproval/${instiCode}`,newData);
  }

  rejectInstitute(instiCode: any) {
    return this.http.delete(`${this.restURL}institutesnodal/${instiCode}`);
  }

  getnodalapprovedList():any{
    return this.http.get(`${this.restURL}nodalapproved`);
  }

  updateFinalStatus(instiCode:any, newData:any){
    return this.http.put(`${this.restURL}ministryinstitute/${instiCode}`,newData);
  }

  rejectMinisterInstitute(instiCode:any){
    return this.http.delete(`${this.restURL}ministryrejectinstitute/${instiCode}`);
  }

}