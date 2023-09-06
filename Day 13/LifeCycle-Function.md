# Life Cycle Functions in Angular

## What are Life Cycle Functions?   

Life Cycle Functions are the functions that are called at different stages of the component. These functions are called automatically by Angular. 

## What are the different Life Cycle Functions?

There are 8 different Life Cycle Functions in Angular. They are as follows:

1. ngOnChanges
2. ngOnInit
3. ngDoCheck
4. ngAfterContentInit
5. ngAfterContentChecked
6. ngAfterViewInit
7. ngAfterViewChecked
8. ngOnDestroy

## What is the use of these Life Cycle Functions?

These Life Cycle Functions are used to perform different tasks at different stages of the component.

## What is ngOnChanges?

ngOnChanges is a Life Cycle Function that is called when the value of the data-bound property is changed. It is called before ngOnInit and whenever one or more data-bound properties change.

## What is ngOnInit?

ngOnInit is a Life Cycle Function that is called after the ngOnChanges function. It is called only once when the component is initialized.

## What is ngDoCheck?

ngDoCheck is a Life Cycle Function that is called when the change detector of the component is invoked. It is called whenever the change detector of the component is invoked.

## What is ngAfterContentInit?

ngAfterContentInit is a Life Cycle Function that is called after the ngDoCheck function. It is called only once after the ngDoCheck function.

## What is ngAfterContentChecked?

ngAfterContentChecked is a Life Cycle Function that is called after the ngAfterContentInit function. It is called whenever the ngAfterContentInit function is called.

## What is ngAfterViewInit?

ngAfterViewInit is a Life Cycle Function that is called after the ngAfterContentChecked function. It is called only once after the ngAfterContentChecked function.

## What is ngAfterViewChecked?

ngAfterViewChecked is a Life Cycle Function that is called after the ngAfterViewInit function. It is called whenever the ngAfterViewInit function is called.

## What is ngOnDestroy?

ngOnDestroy is a Life Cycle Function that is called when the component is destroyed. It is called only once when the component is destroyed.

## What is the order of execution of these Life Cycle Functions?

The order of execution of these Life Cycle Functions is as follows:

1. ngOnChanges
2. ngOnInit
3. ngDoCheck
4. ngAfterContentInit
5. ngAfterContentChecked
6. ngAfterViewInit
7. ngAfterViewChecked
8. ngOnDestroy

## Example

```typescript

import { Component, OnInit, OnChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-life-cycle',
  templateUrl: './life-cycle.component.html',
  styleUrls: ['./life-cycle.component.css']
})

export class LifeCycleComponent implements OnInit, OnChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy {

  constructor() { }

  ngOnInit(): void {
    console.log("ngOnInit");
  }

  ngOnChanges(): void {
    console.log("ngOnChanges");
  }

  ngDoCheck(): void {
    console.log("ngDoCheck");
  }

  ngAfterContentInit(): void {
    console.log("ngAfterContentInit");
  }

  ngAfterContentChecked(): void {
    console.log("ngAfterContentChecked");
  }

  ngAfterViewInit(): void {
    console.log("ngAfterViewInit");
  }

  ngAfterViewChecked(): void {
    console.log("ngAfterViewChecked");
  }

  ngOnDestroy(): void {
    console.log("ngOnDestroy");
  }

}

```

## Output

![LifeCycle-Function](https://raw.githubusercontent.com/Ch-sriram/Angular-Interview-Questions/main/Images/LifeCycle-Function.png)

## Conclusion

These Life Cycle Functions are very useful in performing different tasks at different stages of the component.