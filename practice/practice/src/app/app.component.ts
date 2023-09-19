import { Component, OnInit, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit, OnDestroy {
  // title = 'GoGo Angular';

  // getMin(a: number, b: number) {
  //   return Math.min(a, b);
  // }

  // getMax(a: number, b: number) {
  //   return Math.max(a, b);
  // }

  intervalSubscription: any;
  ngOnInit(): void {
    this.intervalSubscription = setInterval(() => {
      console.log('Hello');
    }, 1000);
  }

  ngOnDestroy(): void {
    if (this.intervalSubscription) {
      clearInterval(this.intervalSubscription);
    }
  }

  

}
