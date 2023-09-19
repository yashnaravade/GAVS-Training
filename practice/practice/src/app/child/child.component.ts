import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
  template: `<p>{{ childMessage }}</p>`,
})
export class ChildComponent {
  // @Input() childMessage: string | undefined;

  // @Input()
  // parentMessage!: string;

  // constructor() {
  //   console.log(this.parentMessage);
  //   console.log(this.childMessage);
  // }

  @Output() messageEvent = new EventEmitter<string>();

  constructor() {}

  sendMessage() {
    this.messageEvent.emit('I speak for the child!');
  }
}
