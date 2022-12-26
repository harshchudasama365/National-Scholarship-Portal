import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { StudenthomeComponent } from './studenthome/studenthome.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import { StudentregistrationComponent } from './studentregistration/studentregistration.component';
import { InstitutionregistrationComponent } from './institutionregistration/institutionregistration.component';
import { InstitutionloginComponent } from './institutionlogin/institutionlogin.component';
import { InstitutionhomeComponent } from './institutionhome/institutionhome.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { DisplayComponent } from './display/display.component';
import { ScholarapplicationComponent } from './scholarapplication/scholarapplication.component';
import { StudentapplicationsComponent } from './studentapplications/studentapplications.component';
import { MinistryComponent } from './ministry/ministry.component';
import { NodalofficerComponent } from './nodalofficer/nodalofficer.component';
import { MinistryhomeComponent } from './ministryhome/ministryhome.component';
import { InstituteapplicationsComponent } from './instituteapplications/instituteapplications.component'
import { NodalhomeComponent } from './nodalhome/nodalhome.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { StudentapplicationministryComponent } from './studentapplicationministry/studentapplicationministry.component';
import { InstitutefinalapprovalComponent } from './institutefinalapproval/institutefinalapproval.component';
import { StudentapplicationinstComponent } from './studentapplicationinst/studentapplicationinst.component';
import { RegupdateComponent } from './regupdate/regupdate.component';
import { SchupdateComponent } from './schupdate/schupdate.component';


@NgModule({
  declarations: [
    AppComponent,
    StudentloginComponent,
    StudenthomeComponent,
    HomeComponent,
    StudentregistrationComponent,
    InstitutionregistrationComponent,
    InstitutionloginComponent,
    InstitutionhomeComponent,
    ContactComponent,
    AboutComponent,
    DisplayComponent,
    ScholarapplicationComponent,
    StudentapplicationsComponent,
    MinistryComponent,
    NodalofficerComponent,
    MinistryhomeComponent,
    InstituteapplicationsComponent,
    NodalhomeComponent,
    PagenotfoundComponent,
    StudentapplicationministryComponent,
    InstitutefinalapprovalComponent,
    StudentapplicationinstComponent,
    RegupdateComponent,
    SchupdateComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
