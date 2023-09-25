var exp = require("express"); //Import expressJS into the application
var path = require("path");
var expen = exp(); //Initialize the environment for express JS app

var visitorCount = 0;
/*
when the client sends a GET request with the URL ending with / , the welcome() function 
is called , Welcome () is sending a dynamic html page as response.
*/
//URI mapping , linking a URI with a function
expen.get("/", welcome);
function welcome(request, response) {
  var str = "<html><body>";
  str += "<b> First website in ExpressJS </b><br>";
  visitorCount++;
  str += "Number of Visitors: " + visitorCount + "<br/>";
  var today = new Date();
  str += "<br><b>Today : </b>" + today + "<BR>";
  str += "<br><a href='/login'>Click to login</a>";
  str += "</body></html>";
  response.send(str); //sends the response back to the caller.
}

expen.get("/login", loginForm);

function loginForm(request, response) {
  console.log(" Displaying Login Form");
  // response.sendFile(path.join (__dirname ,'./loginform.html'));
  response.sendFile(__dirname + "/loginform.html");
}

expen.get("/signin", authenticate);

function authenticate(request, response) {
  console.log("Authenticating...");
  var uname = request.query.userID;
  var upwd = request.query.password;
  if (uname == "validid" && upwd == "validpwd") {
    response.send("<b>Welcome to our System..</b>");
  } else {
    response.send(
      " <b> Invalid UserName/ Password.</b><br><br><br> <a href ='/login'>Retry logging in</a>"
    );
  }

  response.send("you are Authenticated");
}

expen.listen(7800, "localhost");

// Express js is a Micro services and light weigth server ,client web .
// and can create multiple micro service which can be linked all.
