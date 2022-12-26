import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from './authentication.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'NATIONAL_SCHOLARSHIP_PORTAL';
  constructor(private router:Router ,public loginService:AuthenticationService,private logoutService:AuthenticationService){}
  ngOnInit(): void
  {
   
  }
}
