(()=> {
    console.log('fun1');
})(); 
// Q: Explain the above code snippet.
// A: The above code snippet is a self-invoking function. It is also known as an Immediately Invoked Function Expression (IIFE). 
//    It is a function that runs as soon as it is defined. It is a design pattern which is also known as a Self-Executing Anonymous Function and contains two major parts. 
//    The first is the anonymous function with lexical scope enclosed within the Grouping Operator ().
//    This prevents accessing variables within the IIFE idiom as well as polluting the global scope.
//    The second part creates the immediately executing function expression () through which the JavaScript engine will directly interpret the function.
//    The function within the parenthesis () at the end of the expression is used to call the function just after its definition.
//    This pattern is often used when trying to avoid polluting the global namespace, because all the variables used inside the IIFE (like in any other normal function) are not visible outside its scope.

