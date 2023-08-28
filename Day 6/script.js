console.log("Hello World");

let ID = 1234;
let name = "John";

document.writeln("ID is " + ID + " and name is " + name);

document.writeln("<br> Type of ID is \n " + typeof ID + " and type of name is " + typeof name); 

if (typeof ID == "number") {
    document.writeln("<br> ID is a number");
} else {
    document.writeln("<br> ID is not a number");
}

console.log(name.length);

// string methods
console.log(name.toUpperCase()); // JOHN
console.log(name.toLowerCase()); // john
console.log(name.charAt(2)); // h
console.log(name.indexOf("o")); // 1 
console.log(name.lastIndexOf("o")); // 1
console.log(name.substring(1,3)); // oh
console.log(name.slice(1,3)); // oh
console.log(name.slice(-3)); // ohn
console.log(name.split("o")); // [ 'J', 'hn' ]
console.log(name.replace("o", "a")); // Jahn
console.log(name.includes("o")); // true 
console.log(name.concat(" Doe")); // John Doe 
console.log(name.repeat(2)); // JohnJohn