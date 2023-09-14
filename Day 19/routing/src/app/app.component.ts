import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-routing';

  goDepartment() {
    window.location.href = '/DepartmentList'; // This line navigates to the DepartmentList page in the browser
  }

  goEmployee() {
    window.location.href = '/EmployeesList'; // This line navigates to the EmployeesList page in the browser
  }
  

}


