# Loops in Angular

## For Loop

```html
<div *ngFor="let item of items">
  {{ item }}
</div>
```

## While Loop

```html
<div *ngIf="items.length > 0">
  <div *ngFor="let item of items">
    {{ item }}
  </div>
</div>
```

## For Loop with index

```html
<div *ngFor="let item of items; let i = index">
  {{ i }} - {{ item }}
</div>
```

## For Loop with first and last

```html
<div *ngFor="let item of items; let isFirst = first; let isLast = last">
  {{ item }} - {{ isFirst }} - {{ isLast }}
</div>
```

## For Loop with odd and even

```html
<div *ngFor="let item of items; let isOdd = odd; let isEven = even">
  {{ item }} - {{ isOdd }} - {{ isEven }}
</div>
```

## For Loop with trackBy

```html
<div *ngFor="let item of items; trackBy: trackByFn">
  {{ item }}
</div>
```

## For each loop

```html
<div *ngFor="let item of items; let i = index">
  {{ i }} - {{ item }}
</div>
```

## For each loop with index

```html
<div *ngFor="let item of items; let i = index">
  {{ i }} - {{ item }}
</div>
```

## For of loop

```html
<div *ngFor="let item of items">
  {{ item }}
</div>
```

## For of loop with index

```html
<div *ngFor="let item of items; let i = index">
  {{ i }} - {{ item }}
</div>
```

## For in loop

```html
<div *ngFor="let item in items">
  {{ item }}
</div>
```