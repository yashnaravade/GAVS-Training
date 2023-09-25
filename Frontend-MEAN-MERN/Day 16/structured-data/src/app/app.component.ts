import { Component } from '@angular/core';
import { empManagementService } from './empmanagementservice';
import { ProjectManagementServiceService } from './project-management-service.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[ProjectManagementServiceService]
})
export class AppComponent {
  title = 'structureddata';
  empId:number=1;
  //emp=new Object();
  constructor(private PmMgsvc:ProjectManagementServiceService){}
  emplist = [
  { empId:1,firstName: "Yogeshwaran", lastName: "Rajendran", age: 22, location: "chennai" },
  { empId:2,firstName: "Rajesh", lastName: "Kumar", age: 34, location: "bangalore" },
  { empId:3,firstName: "Johnny", lastName: "DcruZe", age: 22, location: "chennai" }
  ];
  emp = { empId:4,firstName: "Vijay", lastName: "Antony", age: 38, location: "chennai" }
  
  // firstName: string= "Unknown";
  // lastName:string= "Unknown";
  // age:number= 22;
  // location:string= "chennai" 

  empsvc:empManagementService =new empManagementService;
  
  addfunction()
  {
    this.empsvc.addEmp(this.emp, this.emplist);
  }

  forLoops()
  {
    for(let i in this.emplist)
      console.log(i);
    for(let i of this.emplist)
    console.log(i.empId+","+i.firstName+","+i.lastName+","+i.age+","+i.location);
  }
  addProject()
  {
    this.PmMgsvc.addProjects();
  }
  deleteEmp()
  {
    this.empsvc.deleteEmp(this.empId, this.emplist);
  }
}
