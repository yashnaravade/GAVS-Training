// import { readFile, readFileSync } from "fs";
import fs from "fs";

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

// readFile("data2.txt", function (err, data) {
//   if (err) return console.error(err);
//   console.log(data.toString());
// });
// console.log("Program Ended");

// Get File Information with fs.stat()

// console.log("Going to get file info!");
// fs.stat("data2.txt", function (err, stats) {
//   if (err) {
//     return console.error(err);
//   }
//   console.log(stats);
//   console.log("Got file info successfully!");

//   // Check file type
//   console.log("isFile ? " + stats.isFile());
//   console.log("isDirectory ? " + stats.isDirectory());
// });

// Writing a File

// console.log("Going to write into existing file");
// fs.writeFile("data2.txt", "Simply Easy Learning!", function (err) {
//   if (err) {
//     return console.error(err);
//   }

//   console.log("Data written successfully!");
//   console.log("Let's read newly written data");

//   fs.readFile("data2.txt", function (err, data) {
//     if (err) {
//       return console.error(err);
//     }
//     console.log("Asynchronous read: " + data.toString());
//   });
// });


// Closing a File
// var buf = new Buffer.alloc(1024); // create a buffer to hold the contents of the file before displaying it to the console. The buffer is an array of bytes, and the toString() method converts it to a string. The buffer is sized to hold the number of bytes returned by the read() method. If the file is larger than the buffer, only the first part of the file will be read. If the file is smaller than the buffer, the entire file will be read. The read() method returns the number of bytes read. The close() method closes the file. The callback function is called when the file is closed. If an error occurs, the error parameter will contain the error code, and the data parameter will be undefined. If there is no error, the error parameter will be null, and the data parameter will contain the contents of the file. The data is displayed to the console.

// console.log("Going to open an existing file");

// fs.open("data2.txt", "r+", function (err, fd) {
//   // r+ is used to open the file for reading and writing. The callback function gets two arguments (err, fd) where fd is the file descriptor returned by the open method. The file descriptor is a unique number that identifies the opened file. All subsequent read or write operations take place through this file descriptor. The fs.read() method is used to read data from the file. This method will read data from the file identified by the file descriptor, buf is the buffer that the data will be written to, offset is the offset in the buffer to start writing at, length is an integer specifying the number of bytes to read, and position is an integer specifying where to begin reading from in the file. The callback function gets the three arguments, (err, bytesRead, buffer). The fs.close() method is used to close the opened file. It accepts the file descriptor as the first argument and the callback function as the second argument.
//   if (err) {
//     return console.error(err);
//   }

//   console.log("File opened successfully!");
//   console.log("Going to read the file");

//   fs.read(fd, buf, 0, buf.length, 0, function (err, bytes) {
//     if (err) {
//       console.log(err);
//     }

//     // Print only read bytes to avoid junk.
//     if (bytes > 0) {
//       console.log(buf.slice(0, bytes).toString());
//     }

//     // Close the opened file.
//     fs.close(fd, function (err) {
//       if (err) {
//         console.log(err);
//       }
//       console.log("File closed successfully.");
//     });
//   });
// });

// Truncate a File
console.log("Going to open an existing file");
fs.open("data2.txt", "r+", function (err, fd) {
  if (err) {
    return console.error(err);
  }
  console.log("File opened successfully!");
  console.log("Going to truncate the file after 10 bytes");

  // Truncate the opened file.
  let buf = new Buffer.alloc(1024);
  fs.ftruncate(fd, 10, function (err) {
    if (err) {
      console.log(err);
    }
    console.log("File truncated successfully.");
    console.log("Going to read the same file");

    fs.read(fd, buf, 0, buf.length, 0, function (err, bytes) {
      if (err) {
        console.log(err);
      }

      // Print only read bytes to avoid junk.
      if (bytes > 0) {
        console.log(buf.slice(0, bytes).toString());
      }

      // Close the opened file.
      fs.close(fd, function (err) {
        if (err) {
          console.log(err);
        }
        console.log("File closed successfully.");
      });
    });
  });
});