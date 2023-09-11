import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'structured-data';

  emp={firstName: "Yash", lastName: "Naravade", age : 22, salary : 50000, designation : "Software Engineer", location : "Pune"};

  // declare an array of objects
  employees = [
    {firstName: "Yash", lastName: "Naravade", age : 22, salary : 50000, designation : "Software Engineer", location : "Pune"},
    {firstName: "Ankit", lastName: "Kumar", age : 25, salary : 60000, designation : "Senior Software Engineer", location : "Mumbai"},
    {firstName: "Vansh", lastName: "Devgan", age : 30, salary : 70000, designation : "Team Lead", location : "Pune"},
    {firstName: "Gaurav", lastName: "Saxena", age : 35, salary : 80000, designation : "Project Manager", location : "Bangalore"},
    {firstName: "Ayushi", lastName: "Vaishnav", age : 40, salary : 90000, designation : "Project Manager", location : "Pune"},
    {firstName: "Sarthak", lastName: "Garg", age : 45, salary : 100000, designation : "Project Manager", location : "Mumbai"},
    {firstName: "Niraj", lastName: "Sahu", age : 50, salary : 110000, designation : "Project Manager", location : "Pune"}
  ];

    
}
