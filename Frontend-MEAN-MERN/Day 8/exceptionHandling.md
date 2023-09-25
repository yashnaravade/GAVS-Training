### Exception Handling in JavaScript

- JavaScript provides a way to handle runtime errors by using try-catch-finally block.
- The try block contains the code which may throw an exception.
- The catch block catches the exception thrown by try block.
- The finally block executes after execution of try and catch blocks regardless of the occurrence of an exception.
- The throw statement is used to throw an exception.
- The try-catch-finally block can be nested to handle the exception.

#### Syntax

```javascript
try {
    // Code to execute
}
catch (exception) {
    // Code to handle exception
}
finally {
    // Code to execute regardless of an exception
}
```

#### Example

```javascript
try {
    var a = 10;
    var b = 0;
    var c = a / b;
    console.log(c);
}
catch (exception) {
    console.log(exception);
}
finally {
    console.log("Finally block executed");
}
```

#### Output

```
Infinity
Finally block executed
```


### Throwing an Exception

- The throw statement is used to throw an exception.

#### Syntax

```javascript
throw expression;
```

#### Example

```javascript
try {
    var a = 10;
    var b = 0;
    if (b == 0) {
        throw "Divide by zero exception";
    }
    var c = a / b;
    console.log(c);
}
catch (exception) {
    console.log(exception);
}
finally {
    console.log("Finally block executed");
}
```

#### Output

```
Divide by zero exception
Finally block executed
```

### Nested try-catch-finally Block

- The try-catch-finally block can be nested to handle the exception.
- The inner try-catch-finally block must be enclosed in a try block of outer try-catch-finally block.
- The inner try-catch-finally block can be nested to any level.
- The inner try-catch-finally block must be enclosed in a try block of outer try-catch-finally block.

#### Syntax

```javascript
try {
    // Code to execute
    try {
        // Code to execute
    }
    catch (exception) {
        // Code to handle exception
    }
    finally {
        // Code to execute regardless of an exception
    }
}
catch (exception) {
    // Code to handle exception
}
finally {
    // Code to execute regardless of an exception
}
```

#### Example

```javascript
try {
    try {
        var a = 10;
        var b = 0;
        var c = a / b;
        console.log(c);
    }
    catch (exception) {
        console.log(exception);
    }
    finally {
        console.log("Inner finally block executed");
    }
}
catch (exception) {
    console.log(exception);
}
finally {
    console.log("Outer finally block executed");
}
```

#### Output

```
Infinity
Inner finally block executed
Outer finally block executed
```

### Custom Exception

- JavaScript allows us to create custom exceptions.
- The custom exception must be an instance of Error object.
- The custom exception must be thrown using throw statement.
- The custom exception can be handled using try-catch-finally block.
- The custom exception can be thrown using throw statement.
- The custom exception can be handled using try-catch-finally block.
- The custom exception can be nested to any level.
- The custom exception must be an instance of Error object.


#### Syntax

```javascript
throw new Error(message);
```

#### Example

```javascript
try {
    try {
        var a = 10;
        var b = 0;
        if (b == 0) {
            throw new Error("Divide by zero exception");
        }
        var c = a / b;
        console.log(c);
    }
    catch (exception) {
        console.log(exception);
    }
    finally {
        console.log("Inner finally block executed");
    }
}
catch (exception) {
    console.log(exception);
}
finally {
    console.log("Outer finally block executed");
}
```

#### Output

```
Divide by zero exception
Inner finally block executed
Outer finally block executed
```