import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Institution } from './institution';

@Injectable({
  providedIn: 'root'
})
export class InstitutionregistrationService {

  response:any;
  constructor(private myhttp:HttpClient) { }
restURL:string="http://localhost:9001";
getInstitution()
{
  return this.myhttp.get(this.restURL+"/instituteregistration")
}
addInstitution(add:Institution)
{
  return this.myhttp.post(this.restURL+"/institutes",add)
}
}