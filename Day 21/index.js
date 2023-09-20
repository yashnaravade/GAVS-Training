import { readFile, readFileSync } from "fs";

// function displayData(err, data) {
//   if (err) {
//     console.log(err);
//   } else {
//     console.log(data);
//     console.log("Read" + data.length + "bytes");
//   }

//   readFile("data2.txt", "utf-8", displayData2);
// }

//  blocking code - synchronous
// var data = readFileSync('data2.txt');
// console.log(data.toString());
// console.log("Program Ended"); // this will be printed after the file is read

// non-blocking code - asynchronous

readFile("data2.txt", function (err, data) {
  if (err) return console.error(err);
  console.log(data.toString());
});
console.log("Program Ended");
