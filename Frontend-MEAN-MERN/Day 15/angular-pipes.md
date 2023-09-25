# Angular Pipes

## What are pipes? 

Pipes are a way to transform data in your HTML template before it is displayed. Pipes are a good way to format strings, currency amounts, dates and other display data. 

## Built-in Pipes

Angular comes with a number of built-in pipes that you can use.

### DatePipe

The `DatePipe` is used to format dates in Angular. 

```html
<p>The hero's birthday is {{ birthday | date }}</p>
```

The `DatePipe` can take a format string as an argument. 

```html
<p>The hero's birthday is {{ birthday | date:'MM/dd/yy' }}</p>
```

### UpperCasePipe

The `UpperCasePipe` is used to transform text to uppercase. 

```html
<p>The hero's name is {{ hero.name | uppercase }}</p>
```

### LowerCasePipe

The `LowerCasePipe` is used to transform text to lowercase. 

```html
<p>The hero's name is {{ hero.name | lowercase }}</p>
```

### CurrencyPipe

The `CurrencyPipe` is used to format currency amounts. 

```html
<p>The hero's salary is {{ hero.salary | currency }}</p>
```

The `CurrencyPipe` can take a currency code as an argument. 

```html
<p>The hero's salary is {{ hero.salary | currency:'EUR' }}</p>
```

## Custom Pipes

You can also create your own custom pipes. 

```typescript 
import { Pipe, PipeTransform } from '@angular/core';

@Pipe({name: 'exclamation'})
export class ExclamationPipe implements PipeTransform {
  transform(value: string): string {
    return value + '!';
  }
}
```

```html
<p>The hero's name is {{ hero.name | exclamation }}</p>
```

## Chaining Pipes

You can chain pipes together. 

```html
<p>The hero's name is {{ hero.name | lowercase | exclamation }}</p>
```

## Async Pipes

The `AsyncPipe` is used to display data that is being loaded asynchronously. 

```typescript
@Component({
  selector: 'app-hero-list',
  template: `
    <div *ngFor="let hero of heroes | async">
      {{ hero.name }}
    </div>
  `
})

export class HeroListComponent {
  heroes: Observable<Hero[]>;
  constructor(private heroService: HeroService) {
    this.heroes = this.heroService.getHeroes();
  }
}
```

## Conclusion

Pipes are a great way to format data in your HTML templates. Angular comes with a number of built-in pipes that you can use. You can also create your own custom pipes. 