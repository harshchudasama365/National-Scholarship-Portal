import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentapplicationsService {
  
  restURL: string;
  constructor(private myhttp:HttpClient) {
    this.restURL="http://localhost:9001/"
  
  }
  getStudent():Observable<any>{
     return this.myhttp.get(this.restURL+"scholarApplications")
  }

  instApproved():Observable<any>{
    return this.myhttp.get(this.restURL+"instituteapproved")
 }

  getStudentDoc():Observable<any>{
    return this.myhttp.get(`${this.restURL}get/schDoc`);
  }
  downloadFile(aadhar:string,file:string):Observable<any>{
    return this.myhttp.get(`${this.restURL}download/${aadhar}/${file}`, {
      responseType: 'blob'
    })
  }
  // getapplicationList(): Observable<any> {
  //   return this.myhttp.get(`${this.restURL}studentsinnodal`);
  // }

  updateStatus(aadhar:any, newData: any):Observable<Object>{
    
    return this.myhttp.put(`${this.restURL}studentApproval/${aadhar}`,newData);
  }

  updateStatusIns(aadhar:any, newData: any):Observable<Object>{
    
    return this.myhttp.put(`${this.restURL}ApprovalbyInstitute/${aadhar}`,newData);
  }

  updateFinalStatus(aadhar:any, newData: any):Observable<Object>{
    
    return this.myhttp.put(`${this.restURL}ministrystudent/${aadhar}`,newData);
  }

  deleteStudent(aadhar:any):Observable<any> {

    return this.myhttp.delete(`${this.restURL}studentApprovalDenied/${aadhar}`)
  }

  deleteMinistryStudent(aadhar:any):Observable<any> {

    return this.myhttp.delete(`${this.restURL}ministryStudentDenied/${aadhar}`)
  }
  

  getFinalApplicationList(): any {
    return this.myhttp.get(`${this.restURL}getministrystudent`)
  }

  getInstituteApplicationList(email : any) : any {
    return this.myhttp.get(`${this.restURL}studentininstitute/${email}`)
  }

}