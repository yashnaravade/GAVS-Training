# Services in Angular 

## What is a Service?

A service is a class that can be injected into a component. It is used to share data and functionality across components. 

## Creating a Service

To create a service, run the following command:

```bash
ng generate service services/MyService
```


## Injecting a Service

To inject a service into a component, add it to the constructor:

```typescript
constructor(private myService: MyService) { }
```

## Using a Service

To use a service, call its methods:

```typescript
this.myService.myMethod();
```

## Example

```typescript
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MyService {

  constructor() { }

  myMethod() {
    console.log('Hello from my service!');
  }
}
```

```typescript
import { Component } from '@angular/core';
import { MyService } from '../services/my.service';

@Component({
  selector: 'app-my-component',
  templateUrl: './my-component.component.html',
  styleUrls: ['./my-component.component.css']
})

export class MyComponentComponent {

  constructor(private myService: MyService) { }

  myMethod() {
    this.myService.myMethod();
  }
}
```

```html
<button (click)="myMethod()">Click Me!</button>
```

## Example with Data

```typescript
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class MyService {

  constructor() { }

  myMethod() {
    return 'Hello from my service!';
  }
}
```

```typescript
import { Component } from '@angular/core';
import { MyService } from '../services/my.service';

@Component({
  selector: 'app-my-component',
  templateUrl: './my-component.component.html',
  styleUrls: ['./my-component.component.css']
})

export class MyComponentComponent {

  constructor(private myService: MyService) { }

  myMethod() {
    console.log(this.myService.myMethod());
  }
}
```

```html
<button (click)="myMethod()">Click Me!</button>
```

## Example with Data and Input

```typescript
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class MyService {

  constructor() { }

  myMethod() {
    return 'Hello from my service!';
  }
}
```

```typescript
import { Component } from '@angular/core';
import { MyService } from '../services/my.service';

@Component({
  selector: 'app-my-component',
  templateUrl: './my-component.component.html',
  styleUrls: ['./my-component.component.css']
})

export class MyComponentComponent {

  constructor(private myService: MyService) { }

  myMethod() {
    console.log(this.myService.myMethod());
  }
}
```

```html
<button (click)="myMethod()">Click Me!</button>
```