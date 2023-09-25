# Express.js

## What is Express.js?

Express.js is a Node.js web application server framework, designed for building single-page, multi-page, and hybrid web applications. It is the de facto standard server framework for node.js. It is a lightweight framework used to build web applications in Node.js. It provides a number of robust features for building single and multi-page web applications. Express.js is inspired by the popular Ruby framework, Sinatra. It was developed by TJ Holowaychuk and is maintained by the Node.js foundation and numerous open source contributors. It used to make APIs and web applications. It is open source and free to use.

## Features of Express.js

- It can be used to design single-page, multi-page, and hybrid web applications.
- It allows to setup middlewares to respond to HTTP Requests.
- It defines a routing table which is used to perform different actions based on HTTP Method and URL.
- It allows to dynamically render HTML Pages based on passing arguments to templates.
- It allows to set a view engine. Various view engines available are Jade, EJS, Handlebars, etc.
- It allows to set up a middleware to define a folder which can include static content such as images, CSS files, and JavaScript files.
- It has a large number of HTTP utility methods which simplifies to build a web application.
- It supports both the MVC and the single-page application architectures.
- It contains a built-in error handler to display errors in a web browser in development mode.
- It follows the DRY (Don’t Repeat Yourself) principle.
- It supports the REST API.

## Installation of Express.js

Express.js is a Node.js framework. So, before installing Express.js, we must install Node.js and npm on our system. To install Express.js, follow the following steps. We can install Express.js in two ways: globally and locally.

### Steps to make your first Express.js application

1. Install Node.js and npm on your system.
2. Create a folder for your application.
3. Open the command prompt and set the path of this folder.
4. Type `npm init` on the command prompt. It will create a package.json file for your application.
5. Install Express.js in this folder by typing `npm install express --save` on the command prompt.
6. Create a file named app.js in the same folder.
7. Write the following code in this file:

<!-- use es6 module syntax -->
```js
import express from 'express';
const app = express();
const port = 3000;

app.get('/', (req, res) => {
  res.send('Hello World!');
});

app.listen(port, () => {
  console.log(`Example app listening at http://localhost:${port}`);
});
```

8. Run the app.js file by typing `node app.js` on the command prompt.
9. Open the browser and type `http://localhost:3000/` in the address bar. This will display the following result:
10. Now, you can create different routes and run your application.
11. To stop the server, press `Ctrl+C` in the command prompt.
12. To install Express.js globally, type `npm install -g express` on the command prompt.
13. To install Express.js locally, type `npm install express` on the command prompt.
14. To install Express.js locally and save it in the dependencies list, type `npm install express --save` on the command prompt.
15. To install Express.js locally and save it in the devDependencies list, type `npm install express --save-dev` on the command prompt.
16. To install Express.js globally and save it in the dependencies list, type `npm install express -g --save` on the command prompt.


## Express.js Request

The req object represents the HTTP request and has properties for the request query string, parameters, body, HTTP headers, and so on. In this documentation and by convention, the object is always referred to as req (and the HTTP response is res) but its actual name is determined by the parameters to the callback function in which you’re working.

## Express.js Response

The res object represents the HTTP response that an Express app sends when it gets an HTTP request. In this documentation and by convention, the object is always referred to as res (and the HTTP request is req) but its actual name is determined by the parameters to the callback function in which you’re working.


## Express.js Application Structure

Express.js is a flexible Node.js web application framework that provides a wide set of features to develop both single-page and multi-page web applications. It organizes an application into the MVC architecture that contains the following three important components:

- Models: It contains the business logic of an application.
- Views: It contains the presentation layer of an application which displays the data.
- Controllers: It contains the request handlers that are used to handle the user request and retrieve data, and send it to the views.
- Express.js application contains the following important folders:
- bin: It contains the executable file of an application.
- node_modules: It contains all the dependencies of an application.
- public: It contains all the static files such as images, CSS, and JavaScript files.   
- routes: It contains the route files of an application.
- views: It contains the view files of an application.
- app.js: It contains the main file of an application.
- package.json: It contains the metadata of an application.
- package-lock.json: It contains the metadata of an application.
- .gitignore: It contains the files and folders that are ignored by Git.
- .env: It contains the environment variables of an application.
- .env.example: It contains the example of environment variables of an application.
- .eslintrc.json: It contains the configuration settings of ESLint.
- .prettierrc: It contains the configuration settings of Prettier.
- .prettierignore: It contains the files and folders that are ignored by Prettier.
- .travis.yml: It contains the configuration settings of Travis CI.
- .codeclimate.yml: It contains the configuration settings of Code Climate.
- .gitattributes: It contains the attributes of Git.
- .editorconfig: It contains the configuration settings of the editor.
- .github: It contains the configuration settings of GitHub.

## Express.js Routing

Routing refers to determining how an application responds to a client request to a particular endpoint, which is a URI (or path) and a specific HTTP request method (GET, POST, and so on). Each route can have one or more handler functions, which are executed when the route is matched. Route definition takes the following structure:

```js
app.METHOD(PATH, HANDLER)
```

Where:

- app is an instance of express.
- METHOD is an HTTP request method, in lowercase.
- PATH is a path on the server.
- HANDLER is the function executed when the route is matched.
- This is a basic routing example:

```js
// Respond with "Hello World!" on the homepage:
app.get('/', function (req, res) {
  res.send('Hello World!');
});

// Respond to POST request on the root route (/), the application’s home page:
app.post('/', function (req, res) {
  res.send('Got a POST request');
});

// Respond to a PUT request to the /user route:
app.put('/user', function (req, res) {
  res.send('Got a PUT request at /user');
});

// Respond to a DELETE request to the /user route:
app.delete('/user', function (req, res) {
  res.send('Got a DELETE request at /user');
});
```

## Express.js Middleware

Middleware functions are functions that have access to the request object (req), the response object (res), and the next middleware function in the application’s request-response cycle. The next middleware function is commonly denoted by a variable named next.

Middleware functions can perform the following tasks:

- Execute any code.
- Make changes to the request and the response objects.
- End the request-response cycle.
- Call the next middleware function in the stack.
- If the current middleware function does not end the request-response cycle, it must call next() to pass control to the next middleware function. Otherwise, the request will be left hanging.
- An Express application can use the following types of middleware:
- Application-level middleware
- Router-level middleware
- Error-handling middleware
- Built-in middleware
- Third-party middleware
- We can load application-level and router-level middleware with an optional mount path. We can omit the mount path, in which case the middleware will be executed for every request to the app.
- We can load error-handling functions with four arguments, instead of the typical three. For example:

```js
app.use(function (err, req, res, next) {
  console.error(err.stack);
  res.status(500).send('Something broke!');
});
```

- We can load multiple middleware functions that behave just like middleware, except that these functions wrap the middleware callback. For example:

```js

app.use(function (req, res, next) {
  console.log('Time:', Date.now());
  next();
});
```

- We can use the express.static built-in middleware function in Express. This function is based on serve-static, and is responsible for serving the static assets of an Express application. For example:

```js
app.use(express.static('public'));
```

- We can use the express.json built-in middleware function in Express. This function is based on body-parser, and is responsible for parsing the incoming request bodies in a middleware before we handle it. For example:

```js
app.use(express.json());
```

### Watch mode for development

The node 18.0.0 release added support for the --experimental-watch flag, which enables a file system watcher that will automatically restart the Node.js process for you when files are changed. This is a great way to develop Express.js applications. To use this feature, run the following command:

```js
node --experimental-watch app.js
```