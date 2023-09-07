import { Component } from '@angular/core';

@Component({
  selector: 'app-customerdetails',
  templateUrl: './customerdetails.component.html',
  styleUrls: ['./customerdetails.component.css']
})
export class CustomerdetailsComponent {
  firstName:string = "Unknown";
  lastName:string = "Unknown";
  age:number = 22;
  email:string = "Unknown";
  phoneNumber :number= 0;
  joinStatus: boolean=false;//property binding
  location:string='Chennai';
  stylename:string="bstyle";
  constructor() {
    this.firstName = "Yash";
    this.lastName = "Naravade";
    this.age = 22;
    this.email = "yash@gmail.com";
    this.phoneNumber = 2343464567
    console.log("this is constructor")
  }
  ngOnInit() {
    console.log("initialaised")
  }
  ngOnChanges() {
    console.log("updated")
  }
  ngDoCheck() {
    console.log("Verified")
  }
  ngOnDestroy() {
    console.log("Destroyed")
  }


}
