# The Fundamentals of Recursion in Java
Recursion is a problem-solving strategy in which a function divides an issue into smaller, related subproblems. Each recursive call tackles a smaller portion of the problem until it reaches a base case, which is a condition that ends the recursion.

## A Recursive Function's Structure
A recursive function in Java is made up of two parts:

### Base Case(s): 
These are the conditions that cause the recursion to end. When the base case is satisfied, the function ceases to call itself and begins returning values.

### Recursive Case(s): 
In this section, the function calls itself with changed arguments, getting closer to the basic case. To solve the original problem, the function typically combines the results of these recursive calls.


## Example 1: Calculating Factorials:

The factorial of a number is the product of all positive integers less than or equal to that number. For example, the factorial of 5 is 5 * 4 * 3 * 2 * 1 = 120.

```java
public static int factorial(int n) {
  if (n == 1) {
    return 1;
  }
  return n * factorial(n - 1);
}
```

## Example 2: Calculating the nth Fibonacci Number:

The Fibonacci sequence is a sequence of numbers where each number is the sum of the two numbers before it. The sequence starts with 0 and 1.

```java
public static int fib(int n) {
  if (n == 0) {
    return 0;
  } else if (n == 1) {
    return 1;
  }
  return fib(n - 1) + fib(n - 2);
}
```
