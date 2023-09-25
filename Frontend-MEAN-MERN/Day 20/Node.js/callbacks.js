// Callback, its types and higher order functions

// Callbacks are functions that are passed as arguments to other functions. They are used to execute code asynchronously. Callbacks are used in many JavaScript functions. For example, the setTimeout() function takes a callback as its first argument. The callback is executed after the specified time has elapsed.
//  The setInterval() function also takes a callback as its first argument. The callback is executed after every specified time interval. The addEventListener() function also takes a callback as its second argument. The callback is executed when the specified event occurs. The fetch() function also takes a callback as its second argument. The callback is executed when the response is received. The then() function also takes a callback as its second argument. The callback is executed when the promise is resolved. The catch() function also takes a callback as its second argument. The callback is executed when the promise is rejected.

//  There are two types of callbacks: synchronous and asynchronous. Synchronous callbacks are executed immediately. Asynchronous callbacks are executed after some time. For example, the setTimeout() function takes a callback as its first argument. The callback is executed after the specified time has elapsed. So, the callback is executed after some time. So, the callback is an asynchronous callback. But, the forEach() function takes a callback as its first argument. The callback is executed immediately. So, the callback is a synchronous callback.

//  A higher-order function is a function that takes a function as its argument or returns a function as its return value. For example, the setTimeout() function takes a function as its first argument. So, the setTimeout() function is a higher-order function. The forEach() function takes a function as its first argument. So, the forEach() function is a higher-order function. The addEventListener() function takes a function as its second argument. So, the addEventListener() function is a higher-order function. The fetch() function returns a promise. So, the fetch() function is a higher-order function. The then() function takes a function as its second argument. So, the then() function is a higher-order function. The catch() function takes a function as its second argument. So, the catch() function is a higher-order function. The setInterval() function takes a function as its first argument. So, the setInterval() function is a higher-order function.

// Example:

// setTimeout() is a higher-order function

setTimeout(() => {
  console.log("test");
}, 1000);

// forEach() is a higher-order function

let myArray = [1, 2, 3];

myArray.forEach((element) => console.log(element)); // 1 2 3

// addEventListener() is a higher-order function

document.addEventListener("click", () => {
  console.log("test");
});

// callback example

function callFunction(callback) {
  callback();
}

callFunction(() => {
  console.log("test callback");
});

// higher order function example

function higherOrderFunction(callback) {
  callback();
}

higherOrderFunction(() => {
  console.log("test higher order function");
});
