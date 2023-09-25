const express = require("express"); // Import Express.js into the application
const mysql = require("mysql");
// mysql = require('mysql2')
const bodyParser = require("body-parser");

const app = express(); // Initialize the Express.js app
const port = 3000; // Port number on which the application will run`
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

const mysql_conn = mysql.createConnection({
  host: "localhost",
  user: "root",
  port: 3306,
  password: "Sandeep@77",
  database: "new_schema",
});

mysql_conn.connect((error) => {
  if (error) {
    console.error("Error connecting to the database:", error.message);
    if (error.code === 'PROTOCOL_CONNECTION_LOST') {
      console.error("The database connection was closed.");
    } else if (error.code === 'ER_CON_COUNT_ERROR') {
      console.error("The database has too many connections.");
    } else if (error.code === 'ECONNREFUSED') {
      console.error("The database connection was refused.");
    } else {
      console.error("Unknown database connection error.");
    }
    process.exit(1); // Exit the application on database connection error
  } else {
    console.log("Connected to the database");
    console.log(mysql_conn.statistics());
    console.log(mysql_conn.state);
  }
});
app.get('/ap', (req, res) => {
  res.send("helloi");
})


app.post("/signin", authenicate);

function authenicate(request, response) {

  mysql_conn.query('select * from users', processResults);





  //   for (i = 0; i <= users.length - 1; i++) {

  //     if (

  //       request.body["userName"] == users[i].userName &&

  //       request.body["password"] == users[i].password

  //     ) {

  //       found = true;

  //       break;

  //     }

  //   }



  // if (found) {

  //   console.log("user loggedin successfully");

  //   response.send("<b>Welcome</b>");

  // } else response.send("<b>invalid</b><br><a href='/login'>retry login </a>");

}

//var port=0;

//console.log("Enter a port number");

//port = parseInt(f.question()); //read input from user and convert it to integer type



// app.post('/addUser', addNewUser)

// function addNewUser(request, response) {

//     var uid = request.body.userid;

//     var pwd = request.body.password;

//     var email = request.body.email;//request .body is for post command , request.query is for get method

//     var ins = "insert into users values('" + uid + "', '" + pwd + "' ,'" + email + "')";

//     console.log("Executing" + ins);//to check whether the data has been inserted or not

//     my_sqlconn.query(ins)

//     console.log("inserted 1 record successfully")

// }
app.post('/addUser', addNewUser);

function addNewUser(request, response) {
  const uid = request.body.userid;
  const pwd = request.body.password;
  const email = request.body.email;

  const ins = "INSERT INTO users (userid, password, email) VALUES (?, ?, ?)";
  const values = [uid, pwd, email];

  mysql_conn.query(ins, values, (error, results) => {
    if (error) {
      console.error("Error inserting user:", error);
      response.status(500).json({ error: "Internal Server Error" });
    } else {
      console.log("Inserted 1 record successfully");
      response.status(200).json({ message: "User added successfully" });
    }
  });
}


function processResults(error, results) {
  if (error) {
    console.log("Error executing query:", error);
    return;
  }

  for (const result of results) {
    console.log(JSON.stringify(result));
  }
}

// app.post("/signin", (request, response) => {
//     console.log("Authenticating");
//     mysql_conn.query("SELECT * from users", processResults);

//     console.log("Server is running at http://localhost:" + port);
// });



app.listen(port, () => {
  console.log(`Server is running at http://localhost:${port}`);
});
