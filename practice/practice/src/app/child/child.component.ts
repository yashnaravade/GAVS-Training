import { Component, Input, Output, EventEmitter, OnInit } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
  template: `<p>{{ childMessage }}</p>`,
})
// export class ChildComponent implements OnInit {
  export class ChildComponent{
  // @Input() childMessage: string | undefined;

  // @Input()
  // parentMessage!: string;

  // constructor() {
  //   console.log(this.parentMessage);
  //   console.log(this.childMessage);
  // }

  // @Output() messageEvent = new EventEmitter<string>();

 

  // ngOnInit() {}

  // sendMessage() {
  //   this.messageEvent.emit('I speak for the child!');
  // }

  // message: string =
  //   'I speak for the child! You must listen to me! The viewChild method sends me to the parent!';
  //   constructor() {
  //     console.log(this.message);
  //   }
  
}
