import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: ` <div style="text-align: center;">
  <b>Welcome to Gavs Technologies!!!</b><br>
  <b>Hello Mr. </b>{{firstName}} {{lastName}}<br>
  <b>Location: </b>{{location}}<br>
  <b>Project Start Date: </b>{{dateOfJoining}}
</div>
<router-outlet></router-outlet>`,
  styles: [`b{color:red;font-size:25}`]
})
export class AppComponent {
  title = 'firstangular application';
  firstName='Yash';
  lastName='Naravade';
  location='Pune';
  dateOfJoining=new Date();
}
