import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'structured-data';

  emp={firstName: "Yash", lastName: "Naravade", age : 22, salary : 50000, designation : "Software Engineer", location : "Pune"};
  
}
