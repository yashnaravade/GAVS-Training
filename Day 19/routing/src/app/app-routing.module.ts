import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeesListComponent } from './employees-list/employees-list.component';
import { DepartmentListComponent } from './department-list/department-list.component';
import { DefaultComponent } from './default/default.component';

const routes: Routes = [
  { path: 'EmployeesList', component: EmployeesListComponent },
  { path: 'DepartmentList', component: DepartmentListComponent },
  // DefaultComponent
  // if user enters any invalid URL then it will redirect to DefaultComponent
  { path: '', component: DefaultComponent },
  { path: '**', component: DefaultComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
export const routeComponents = [
  EmployeesListComponent,
  DepartmentListComponent,
];
