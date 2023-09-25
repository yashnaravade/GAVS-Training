import { Component } from '@angular/core';

@Component({
  selector: 'app-template-statement',
  templateUrl: './template-statement.component.html',
  styleUrls: ['./template-statement.component.css'],
})
export class TemplateStatementComponent {
  showText = true;

  toggleText() {
    this.showText = !this.showText;
  }
}
