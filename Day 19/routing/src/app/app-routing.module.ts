import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeesListComponent } from './employees-list/employees-list.component';
import { DepartmentListComponent } from './department-list/department-list.component';

const routes: Routes = [{path:'EmployeesList',component:EmployeesListComponent},{path:'DepartmentList',component:DepartmentListComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routeComponents=[EmployeesListComponent,DepartmentListComponent];
