function test0() {
  console.log("test");
}

console.log(test0); // [Function: test]
console.log(test0()); // test undefined
var multiply = new Function("a , b", "console.log(a*b); return a*b");
multiply(2, 3); // 6

// In the above example, we are creating a function using the Function() constructor. The first argument is the list of parameters and the second argument is the function body. So, the output will be 6.

// Q: What is the difference between function declaration and function expression?
// A: Function declaration is hoisted. So, you can call the function before it is declared. But, function expression is not hoisted. So, you can't call the function before it is declared. Also, function declaration is a statement. So, it ends with a semicolon. But, function expression is an expression. So, it doesn't end with a semicolon. Also, function declaration can be used to create a function with a name. But, function expression can be used to create a function without a name.

// Example:

// Function declaration

function test01() {
  console.log("test");
}
test01(); // test
// Function expression
let test1 = function () {
  console.log("test");
};
test1(); // test

// Q: What is the difference between function declaration and arrow function?
// A: Function declaration is hoisted. So, you can call the function before it is declared. But, arrow function is not hoisted. So, you can't call the function before it is declared. Also, function declaration is a statement. So, it ends with a semicolon. But, arrow function is an expression. So, it doesn't end with a semicolon. Also, function declaration can be used to create a function with a name. But, arrow function can be used to create a function without a name.

// Example:

// Function declaration

function test2() {
  console.log("test");
}

test2(); // test

// Arrow function
let test3 = () => {
  console.log("test");
};

test3(); // test

// Q: What is the difference between function expression and arrow function?
// A: Function expression can be used to create a function with a name. But, arrow function can be used to create a function without a name.

// Example:

// Function expression

let test4 = function () {
  console.log("test");
};

test4(); // test

// Arrow function

let test5 = () => {
  console.log("test");
};

test5(); // test

// what is hoisting?
// Hoisting is a JavaScript mechanism where variables and function declarations are moved to the top of their scope before code execution. So, you can call the function before it is declared. But, you can't access the value of the variable before it is declared. Also, you can't access the value of the variable before it is initialized. So, the value of the variable will be undefined before it is initialized.


// Example:

console.log(myName); // ReferenceError: myName is not defined
console.log(myName); // undefined
var myName = "Yash";
console.log(myName); // Yash

// In the above example, we are trying to access the value of the variable before it is declared. So, we are getting a ReferenceError. But, we are trying to access the value of the variable before it is initialized. So, we are getting undefined.

fun1(); // test
function fun1() {
  console.log("test");
}

// In the above example, we are calling the function before it is declared. So, we are getting the output test.
