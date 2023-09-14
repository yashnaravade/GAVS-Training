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

}
