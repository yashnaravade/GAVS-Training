import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css'],
})
export class PipesComponent {
  date = new Date();

  promise = new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve('Promise resolved');
      // reject('Promise rejected');
    }, 2000);
  });
}
