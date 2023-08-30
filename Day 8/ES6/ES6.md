# What is ES6?

ES6 is the sixth edition of the ECMAScript language specification standard. It is a major enhancement to the JavaScript language, and adds many more features intended to make large-scale software development easier.

# Features of ES6

- Arrow Functions
- Classes
- Enhanced Object Literals
- Template Literals
- Destructuring
- Default + Rest + Spread
- Let + Const
- Iterators + For..Of
- Generators
- Unicode
- Modules

# Arrow Functions

Arrow functions are a new way to write anonymous function expressions in ES6, and can be used much like lambda functions in Python or C#. They differ from traditional functions in the way their scope is determined.

```javascript
// ES5
var multiplyES5 = function(x, y) {
  return x * y;
};

// ES6
const multiplyES6 = (x, y) => { return x * y };
```

# Classes

ES6 classes are a simple sugar over the prototype-based OO pattern. Having a single convenient declarative form makes class patterns easier to use, and encourages interoperability. Classes support prototype-based inheritance, super calls, instance and static methods and constructors.

```javascript
// ES5
var Person = function(name, age) {
  this.name = name;
  this.age = age;
};

Person.prototype.sayName = function() {
  console.log(this.name);
};

Person.prototype.sayAge = function() {
  console.log(this.age);
};

var john = new Person('John', 30);

// ES6

class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  sayName() {
    console.log(this.name);
  }

  sayAge() {
    console.log(this.age);
  }
}

let john = new Person('John', 30);
```

# Enhanced Object Literals

Object literals are extended to support setting the prototype at construction, shorthand for foo: foo assignments, defining methods, making super calls, and computing property names with expressions.

```javascript

// ES5

var obj = {
  foo: function() {},
  bar: function() {}
};

// ES6

let obj = {
  foo() {},
  bar() {}
};
```

# Template Literals

Template literals are string literals allowing embedded expressions. You can use multi-line strings and string interpolation features with them.

```javascript

// ES5

var name = 'John Smith';

var html = '<div>' +
             '<p>' + name + '</p>' +
           '</div>';

// ES6

let name = 'John Smith';

let html = `
  <div>
    <p>${name}</p>
  </div>
`;
```

# Destructuring

Destructuring allows binding using pattern matching, with support for matching arrays and objects. Destructuring is fail-soft, similar to standard object lookup foo["bar"], producing undefined values when not found.

```javascript

// ES5

var arr = [1, 2, 3];

var a = arr[0];
var b = arr[1];
var c = arr[2];

// ES6

let arr = [1, 2, 3];

let [a, b, c] = arr;
```

# Default + Rest + Spread

Default parameter values allow formal parameters to be initialized with default values if no value or undefined is passed.

Rest parameters allow us to represent an indefinite number of arguments as an array.

Spread allows an expression to be expanded in places where multiple arguments (for function calls) or multiple elements (for array literals) are expected.

```javascript

// ES5

function foo(x, y) {
  x = x || 11;
  y = y || 31;
  console.log(x + y);
}

foo(); // 42

// ES6

function foo(x = 11, y = 31) {
  console.log(x + y);
}

foo(); // 42
```

```javascript

// ES5

function foo(x, y) {
  var a = Array.prototype.slice.call(arguments, 2);
  console.log(a);
}

foo(1, 2, 3, 4); // [3, 4]

// ES6

function foo(x, y, ...a) {
  console.log(a);
}

foo(1, 2, 3, 4); // [3, 4]
```

# How is ES6 and JavaScript related?

ES6 is a superset of JavaScript. ES6 is a new standard of JavaScript. ES6 is not a completely new language. It is a set of new features of JavaScript.

# References

- [ES6 Features](http://es6-features.org/#Constants)
- [ES6 Tutorial](https://www.tutorialspoint.com/es6/index.htm)
- [ES6 Tutorial](https://www.tutorialsteacher.com/es6)
- [ES6 Tutorial](https://www.w3schools.com/js/js_es6.asp)
- [ES6 Tutorial](https://www.javascripttutorial.net/es6/)
- [ES6 Tutorial](https://www.freecodecamp.org/news/write-less-do-more-with-javascript-es6-5fd4a8e50ee2/)