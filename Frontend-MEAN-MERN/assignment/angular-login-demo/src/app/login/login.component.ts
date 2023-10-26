// login.component.ts

import { Component } from '@angular/core';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent {
  username: string = '';
  password: string = '';
  errorMessage: string = '';

  constructor(private loginService: LoginService, private router: Router) {}

  Authenticate() {
    // Use the login service to authenticate the user
    this.loginService.login(this.username, this.password).subscribe(
      (response: any) => {
        console.log('Login successful:', response);
        // If login is successful, you can redirect to a dashboard or home component
        this.router.navigate(['/home']); // Update the route as needed
      },
      (error: any) => {
        console.error('Login error:', error);
        this.errorMessage = 'Invalid credentials. Please try again.'; // Display an error message
      }
    );
  }
}
