import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'Data-Binding';
  firstName: string = 'Yash';
  lastName: string = 'Naravade';
  age: number = 22;
  isDisabled: boolean = false;
  gender: string = 'male';
  address: string = 'Pune';
  city: string = 'Pune';
  street: string = 'Junnar';
  email: string = 'yash@gmail.com';
  phone: string = '1234567890';
  hobbies: string[] = ['Music', 'Sports', 'Reading'];
  showHobbies: boolean = false;
  favColour: string = 'red'; // default color
}
