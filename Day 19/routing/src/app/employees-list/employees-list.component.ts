import { Component } from '@angular/core';

@Component({
  selector: 'app-employees-list',
  templateUrl: './employees-list.component.html',
  styleUrls: ['./employees-list.component.css']
})
export class EmployeesListComponent {
  emplist: any = [
    { empId: '100', firstName: 'Janakiraman', lastName: 'Boopathy' },
    { empId: '101', firstName: 'Yogeshwaran', lastName: 'Rajendran' },
    { empId: '102', firstName: 'Gaurav', lastName: 'Akash' }];
}
