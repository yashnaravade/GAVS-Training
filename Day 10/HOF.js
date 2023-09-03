// Higher order function in JavaScript

// 1. Function that returns a function
function greet() {
  return function () {
    console.log("Hello");
  };
}
greet()(); // Hello (greet() returns a function). greet()() is same as greet()()() and so on
great(); // [Function] (greet() returns a function)

// 2. Function that accepts a function
function greet(fn) {
  fn();
}
function sayHello() {
  console.log("Hello");
}
greet(sayHello); // Hello

// 3. Function that returns a function that accepts a function
function greet() {
  return function (name) {
    console.log("Hello " + name);
  };
}
greet()("John"); // Hello John

// 4. Function that accepts a function that returns a function
function greet(fn) {
  var result = fn("John");
  console.log(result);
}
function sayHello(name) {
  return "Hello " + name;
}
greet(sayHello); // Hello John

// 5. Function that accepts a function that returns a function that accepts a function
function greet(fn) {
  return function (name) {
    console.log(fn(name));
  };
}
function sayHello(name) {
  return "Hello " + name;
}
greet(sayHello)("John"); // Hello John (greet(sayHello) returns a function that accepts a function)