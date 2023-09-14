import { Component } from '@angular/core';

@Component({
  selector: 'app-employees-list',
  templateUrl: './employees-list.component.html',
  styleUrls: ['./employees-list.component.css'],
})
export class EmployeesListComponent {
  emplist: any = [
    { empId: '100', firstName: 'Janakiraman', lastName: 'Boopathy' },
    { empId: '101', firstName: 'Yogeshwaran', lastName: 'Rajendran' },
    { empId: '102', firstName: 'Gaurav', lastName: 'Akash' },
    { empId: '103', firstName: 'Yash', lastName: 'Naravade' },
  ];

  goHome() {
    window.location.href = '/'; // This line navigates to the home page in the browser
  }

  goBack() {
    window.history.back(); // This line navigates back to the previous page in the browser
  }

  goDepartment() {
    window.location.href = '/DepartmentList'; // This line navigates to the DepartmentList page in the browser
  }
}
