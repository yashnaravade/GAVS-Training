import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeesListComponent } from './employees-list/employees-list.component';
import { DepartmentListComponent } from './department-list/department-list.component';
import { DefaultComponent } from './default/default.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path: 'EmployeesList', component: EmployeesListComponent },
  { path: 'DepartmentList', component: DepartmentListComponent },
  // DefaultComponent
  // if user enters any invalid URL then it will redirect to DefaultComponent
  { path: '', redirectTo: '/home', pathMatch: 'full' }, 
  { path: 'home', component: HomeComponent },
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
