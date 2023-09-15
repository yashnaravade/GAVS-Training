# Node.js

Node is a JavaScript runtime built on Chrome's V8 JavaScript engine. Node.js uses an event-driven, non-blocking I/O model that makes it lightweight and efficient. Node.js' package ecosystem, npm, is the largest ecosystem of open source libraries in the world. 

## Node.js Features

- Asynchronous and Event Driven − All APIs of Node.js library are asynchronous, that is, non-blocking. It essentially means a Node.js based server never waits for an API to return data. The server moves to the next API after calling it and a notification mechanism of Events of Node.js helps the server to get a response from the previous API call.
- Very Fast − Being built on Google Chrome's V8 JavaScript Engine, Node.js library is very fast in code execution.
- Single Threaded but Highly Scalable − Node.js uses a single threaded model with event looping. Event mechanism helps the server to respond in a non-blocking way and makes the server highly scalable as opposed to traditional servers which create limited threads to handle requests. Node.js uses a single threaded program and the same program can provide service to a much larger number of requests than traditional servers like Apache HTTP Server.
- No Buffering − Node.js applications never buffer any data. These applications simply output the data in chunks.
- License − Node.js is released under the MIT license.

## Where to Use Node.js?

Following are the areas where Node.js is proving itself as a perfect technology partner.

- I/O bound Applications
- Data Streaming Applications
- Data Intensive Real-time Applications (DIRT)
- JSON APIs based Applications
- Single Page Applications

## Where Not to Use Node.js?

It is not advisable to use Node.js for CPU intensive applications.

## What is Node.js Process Model?

Node.js runs in a single process and the application code runs in a single thread. To take advantage of the multi-core systems, the user will sometimes want to launch a cluster of Node.js processes to handle the load. The cluster module allows easy creation of child processes that all share server ports. By default the cluster module will round-robin connections to each child process. 

## What is Node.js Control Flow?

Control flow is the order in which the statements will be executed at run time. In any programming language, the control flow is important to execute the statements in the correct order. In JavaScript, the control flow is implemented by using callbacks, because JavaScript is an event driven language.

** Following are the ways to implement control flow in Node.js.**

- Callbacks
- Events and event listeners
- Using async module
- Using promises
- Generators
- Using async/await
- Using observables
- Using callbacks is the most common way of implementing control flow in Node.js.
- Events and event listeners are used to implement the control flow between objects.
- The async module is used to run multiple tasks in parallel and to handle callback hell.
- Promises are used to handle asynchronous operations in Node.js.
- Generators are used to write asynchronous code that looks synchronous.

## What is Callback Hell?

Callback hell is a phenomenon that afflicts a JavaScript developer when he tries to execute multiple asynchronous operations one after the other. The code becomes unreadable and difficult to maintain. The callback hell is also called as the pyramid of doom.

## What is Callback?

A callback is a function that is passed as an argument to another function and is executed after its parent function has completed. The callback function can be executed before or after the parent function.

- Example

```js

function greet(name, callback) {
   console.log('Hi' + ' ' + name);
   callback();
}
// callback function

function callMe() {
   console.log('I am callback function');
}

// passing function as an argument

greet('John', callMe);

```

- Here, the function callMe() is passed as an argument to the function greet(). The function callMe() is a callback function. The function greet() calls the callback function after it has finished execution. The callback function can be called before or after the parent function. In the above example, the callback function is called after the parent function has finished execution. 

## What is Event Loop in Node.js?

Node.js is a single-threaded application, but it can support concurrency via the concept of event and callbacks. Every API of Node.js is asynchronous and being single-threaded, they use async function calls to maintain concurrency. Node uses observer pattern. Node thread keeps an event loop and whenever a task gets completed, it fires the corresponding event which signals the event-listener function to execute.

## What is Event Emitter in Node.js?

EventEmitter is a class that is used to create event handlers in Node.js. EventEmitter class lies in the events module. Many objects in a Node emit events, for example, a net.Server emits an event each time a peer connects to it, an fs.readStream emits an event when the file is opened. All objects which emit events are the instances of events.EventEmitter.

## What is Buffers in Node.js?

Buffer is a temporary memory storage unit which is primarily used to store data while it is being moved from one place to another. It is a global class and can be accessed in an application without importing a buffer module. Buffer class is used because pure JavaScript is not compatible with binary data. So, when dealing with TCP streams or the file system, it's necessary to handle octet streams. Buffer class is used to represent a fixed-length sequence of bytes. Many Node APIs support Buffers, for example, streams, file system, TCP and TLS streams, etc.

## What is Stream in Node.js?

Streams are objects that let you read data from a source or write data to a destination in continuous fashion. In Node.js, there are four types of streams −

- Readable − Stream which is used for read operation.
- Writable − Stream which is used for write operation.
- Duplex − Stream which can be used for both read and write operation.
- Transform − A type of duplex stream where the output is computed based on input.

### Each type of Stream is an EventEmitter instance and throws several events at different instance of times. For example, some of the commonly used events are −

- data − This event is fired when there is data is available to read.
- end − This event is fired when there is no more data to read.
- error − This event is fired when there is any error receiving or writing data.
- finish − This event is fired when all the data has been flushed to underlying system.
- Example

```js   
var fs = require("fs");
var data = '';

// Create a readable stream 

const readerStream = fs.createReadStream('input.txt');

// Set the encoding to be utf8.

readerStream.setEncoding('UTF8');

// Handle stream events --> data, end, and error

readerStream.on('data', function(chunk) {
   data += chunk;
});

readerStream.on('end',function() {
   console.log(data);
});

readerStream.on('error', function(err) {
   console.log(err.stack);
});

console.log("Program Ended");

```

## What is Piping in Node.js?

Piping is a mechanism where we provide the output of one stream as the input to another stream. It is normally used to get data from one stream and to pass the output of that stream to another stream. There is no limit on piping operations.

- Example

```js
var fs = require("fs");

// Create a readable stream 

let readerStream = fs.createReadStream('input.txt');

// Create a writable stream

let writerStream = fs.createWriteStream('output.txt');

// Pipe the read and write operations

// read input.txt and write data to output.txt

readerStream.pipe(writerStream);

console.log("Program Ended");

```

## What is the Difference Between Asynchronous and Non-blocking?

- Asynchronous − In synchronous execution, each operation blocks the execution of code until it completes. In asynchronous execution, the program can continue with the remaining code without waiting for the current operation to finish.
- Non-Blocking − In non-blocking execution, the executing code never blocks, always returns immediately whether it's ready or not. It does not wait for the response from the code that is currently executing. Callbacks are generally used in non-blocking code.

### Example

```js
// Synchronous code

var fs = require("fs");

var data = fs.readFileSync('input.txt');

console.log(data.toString());
console.log("Program Ended");

// Asynchronous code

var fs = require("fs");

fs.readFile('input.txt', function (err, data) {
   if (err) return console.error(err);
   console.log(data.toString());
});

console.log("Program Ended");

```

### Explanation: 
 
- In the above example, the program will read the file input.txt synchronously and print the file content. After that, the program will print the string "Program Ended". The program will execute in the following order.
- The program will read the file input.txt synchronously and store the output in the variable data.
- The program will print the content of the file input.txt.
- The program will print the string "Program Ended".
- In the above example, the program will read the file input.txt asynchronously and print the file content. After that, the program will print the string "Program Ended". The program will execute in the following order.
- The program will print the string "Program Ended".
- The program will read the file input.txt asynchronously and store the output in the variable data.
- The program will print the content of the file input.txt.