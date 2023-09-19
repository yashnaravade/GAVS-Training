import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css'], // this is the child component selector.
  // The childMessage property is bound to the string "I speak for the parent!".
  // This is the parent component template.
  // How does the child component know that it should expect a childMessage property?
  // The @Input() decorator!
  // The @Input() decorator is used to allow data to be passed from a parent component to a child component.
  // The @Input() decorator indicates that the property value passes in from the component's parent.
  //Q: How to use the childMessage property in the child component?
  //A: Use the childMessage property in the child component's template.
})
export class ParentComponent {
  parentMessage = 'message from parent';
  childMessage = 'I speak for the parent!';

  recieveMessage(msg: string) {
    this.childMessage = msg;
    alert(this.childMessage);
    console.log(this.childMessage);
  }
}
