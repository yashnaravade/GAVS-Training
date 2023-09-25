import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  title = 'angular-routing';

  goDepartment() {
    window.location.href = '/DepartmentList'; // This line navigates to the DepartmentList page in the browser
  }

  goEmployee() {
    window.location.href = '/EmployeesList'; // This line navigates to the EmployeesList page in the browser
  }
  

}
