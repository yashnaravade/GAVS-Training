import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'angular-forms';

  onSubmit() {
    // Handle the form submission logic here
    console.log('Form submitted');
  }

  processData(data: any) {
    // Handle the form submission logic here
    console.log('Form submitted');
  }
}
