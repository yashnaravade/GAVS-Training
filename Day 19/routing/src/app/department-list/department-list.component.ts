import { Component } from '@angular/core';

@Component({
  selector: 'app-department-list',
  templateUrl: './department-list.component.html',
  styleUrls: ['./department-list.component.css']
})
export class DepartmentListComponent {
  deplist: any = [{ deptId: 'PR', deptName: 'public relations' },
  { deptId: 'HR', deptName: 'human resource' },
  { deptId: 'IT', deptName: 'information technology' },
  ];

  goBack() {
    window.history.back(); // This line navigates back to the previous page in the browser
  }

  goHome() {
    window.location.href = '/'; // This line navigates to the home page in the browser
  }

  goEmployee() {
    window.location.href = '/EmployeesList'; // This line navigates to the EmployeesList page in the browser
  }

}
