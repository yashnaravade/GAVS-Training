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
  favTheme: string = 'dark'; // default theme
  favBackgroundTheme = {
    background1: 'lightblue',
    background2: 'lightcoral',
    background3: 'lightgreen',
    background4: 'lightyellow',
  };
  isEnabled: boolean = false;
  agree: boolean = false;
  backgroundThemes = ['lightblue', 'lightcoral', 'lightgreen', 'lightyellow'];
  changeBackgroundTheme() {
    this.favColour = this.favBackgroundTheme.background1;
  }
  changeBackgroundTheme2() {
    this.favColour = this.favBackgroundTheme.background2;
  }
  changeBackgroundTheme3() {
    this.favColour = this.favBackgroundTheme.background3;
  }
  changeBackgroundTheme4() {
    this.favColour = this.favBackgroundTheme.background4;
  }

  save() {
    var message = 'Saved Successfully';
    alert(message);
}

verifyFirstName(obj: any) {
  if (obj.value == '') {
    alert('First Name is required');
  }
}

names: string[] = ['Yash', 'Rahul', 'Rohit', 'Sachin', 'Virat'];
location: string = 'Pune';
  }


