import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentregistrationService {

  response:any;
  constructor(private myhttp:HttpClient) { }
restURL:string="http://localhost:9001";
getStudent()
{
  return this.myhttp.get(this.restURL+"/studentdetails")
}

getStudentDetails(aadhar:any):Observable<any>
{
  return this.myhttp.get(this.restURL+"/status/studenthome/"+aadhar);
}

registerStudent(add:student)
{
  console.log(add);
  return this.myhttp.post(this.restURL+"/studentregister",add)
}

updateStd(add:student)
{
  console.log(add);
  return this.myhttp.put(this.restURL+"/updatestudent",add)
}


}