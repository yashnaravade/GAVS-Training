import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'GoGo Angular';

  getMin(a: number, b: number) {
    return Math.min(a, b);
  }

  getMax(a: number, b: number) {
    return Math.max(a, b);
  }
}
