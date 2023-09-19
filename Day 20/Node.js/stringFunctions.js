// String Functions

// 1. charAt()
// This function returns the character at the specified index.

// Syntax:
// string.charAt(index)

// Example:

let myName = "Yash";
console.log(myName.charAt(1)); // a

// 2. charCodeAt()
// This function returns the Unicode of the character at the specified index.

// Syntax:
// string.charCodeAt(index)

// Example:

// let myName = "Yash";
console.log(myName.charCodeAt(1)); // 97

// 3. concat()
// This function joins two or more strings and returns a new string.

// Syntax:
// string.concat(string1, string2, ..., stringX)

// Example:

// let myName = "Yash";
console.log(myName.concat(" ", "Naravade")); // Yash Naravade

// 4. endsWith()

// This function checks whether a string ends with the specified string/characters and returns true or false.

// Syntax:
// string.endsWith(searchString, length)

// Example:

// let myName = "Yash";
console.log(myName.endsWith("sh")); // true
console.log(myName.endsWith("sh", 4)); // false

// 5. fromCharCode()
// This function returns a string created from the specified sequence of Unicode values.

// Syntax:
// String.fromCharCode(num1, num2, ..., numX)

// Example:
console.log(String.fromCharCode(97, 98, 99)); // abc

// 6. includes()
// This function checks whether a string contains the specified string/characters and returns true or false.

// Syntax:
// string.includes(searchString, position)

// Example:

// let myName = "Yash";
console.log(myName.includes("sh")); // true

// 7. indexOf()
// This function returns the index of the first occurrence of the specified string/characters.

// Syntax:
// string.indexOf(searchValue, fromIndex)

// Example:

// let myName = "Yash";

console.log(myName.indexOf("a")); // 1

// 8. lastIndexOf()

// This function returns the index of the last occurrence of the specified string/characters.

// Syntax:
// string.lastIndexOf(searchValue, fromIndex)

// Example:

// let myName = "Yash";
console.log(myName.lastIndexOf("a")); // 3

// 9. match()
// This function searches a string for a match against a regular expression, and returns the matches, as an Array object.

// Syntax:
// string.match(regexp)

// Example:

// let myName = "Yash";

console.log(myName.match(/a/g)); // [ 'a', 'a' ]

// Q: What is a regular expression?
// A: A regular expression is a sequence of characters that forms a search pattern. It can be used to check whether a string contains a specified search pattern or not.

// Q: How does the above regular expression work?
// A: The above regular expression is /a/g. The / / is used to enclose the regular expression. The g is used to search for all matches. So, the above regular expression will search for all occurrences of a in the string. If you want to search for all occurrences of a in the string, you can use the above regular expression. If you want to search for only the first occurrence of a in the string, you can use /a/.

// 10. repeat()
// This function returns a new string with a specified number of copies of the string it was called on.

// Syntax:
// string.repeat(count)

// Example:

// let myName = "Yash";
console.log(myName.repeat(2)); // YashYash

// 11. replace()
// This function searches a string for a specified value, or a regular expression, and returns a new string where the specified values are replaced.

// Syntax:
// string.replace(searchValue, newValue)

// Example:

// let myName = "Yash";
console.log(myName.replace("Yash", "Yash Naravade")); // Yash Naravade

// 12. search()
// This function searches a string for a specified value, or regular expression, and returns the position of the match.

// Syntax:
// string.search(searchValue)

// Example:

// let myName = "Yash";
console.log(myName.search("Yash")); // 0

// Difference between indexOf() and search() and match() and exec()
// The indexOf() method returns the position of the first occurrence of a specified value in a string. The search() method searches a string for a specified value and returns the position of the match. The match() method searches a string for a match against a regular expression, and returns the matches, as an Array object. The exec() method searches a string for a specified value, and returns the text of the found value, as an Array object.

// 13. slice()
// This function extracts a part of a string and returns the extracted part in a new string.

// Syntax:
// string.slice(start, end)

// Example:
// let myName = "Yash";
console.log(myName.slice(1, 3)); // as

// 14. exec()
// This function searches a string for a specified value, and returns the text of the found value, as an Array object.

// Syntax:
// regexp.exec(string)

// Example:

// let myName = "Yash";

console.log(/a/.exec(myName)); // [ 'a', index: 1, input: 'Yash', groups: undefined ]

// 15. split()
// This function splits a string into an array of substrings.

// Syntax:
// string.split(separator, limit)

// Example:

// let myName = "Yash";
console.log(myName.split("")); // [ 'Y', 'a', 's', 'h' ]

// 16. startsWith()
// This function checks whether a string starts with the specified string/characters and returns true or false.

// Syntax:
// string.startsWith(searchString, position)

// Example:

// let myName = "Yash";
console.log(myName.startsWith("Ya")); // true
console.log(myName.startsWith("Ya", 1)); // false

// 17. substring()
// This function extracts the characters from a string, between two specified indices, and returns the new sub string.

// Syntax:
// string.substring(start, end)

// Example:

// let myName = "Yash";
console.log(myName.substring(1, 3)); // as

// 18. toLowerCase()
// This function converts a string to lowercase letters.

// Syntax:
// string.toLowerCase()

// 19. toUpperCase()

// 20. trim()
// This function removes whitespace from both sides of a string.

// Syntax:
// string.trim()

// 21. valueOf()
// This function returns the primitive value of a String object.

// Syntax:

// string.valueOf()

// Example:

// let myName = "Yash";
console.log(myName.valueOf()); // Yash

// 22. toString()

// This function returns a string representing the specified object.

// Syntax:
// object.toString()

// Example:

// let myName = "Yash";
console.log(myName.toString()); // Yash

// 23. localeCompare()

// This function compares two strings in the current locale.

// Syntax:
// string.localeCompare(compareString)

// Example 1:

// let myName = "Yash";
console.log(myName.localeCompare("Yash")); // 0

// Example 2:

// let myName = "Yash";
console.log(myName.localeCompare("Yash Naravade")); // -1

// Example 3:

// let myName = "Yash";

console.log(
  myName.localeCompare("Yash Naravade", "en", { sensitivity: "base" })
); // 0

// 24. matchAll()
// This function returns an iterator of all results matching a string against a regular expression, including capturing groups.

// Syntax:
// regexp.matchAll(string)

// Example:

// let myName = "Yash";
console.log(myName.matchAll(/a/g)); // [RegExpStringIterator] {}

// 25. padEnd()

// This function pads the current string with a given string (repeated, if needed) so that the resulting string reaches a given length.

// Syntax:

// string.padEnd(targetLength, padString)

// Example:

// let myName = "Yash";
console.log(myName.padEnd(10, "a")); // Yashaaaaaa

// 26. padStart()
// This function pads the current string with another string (multiple times, if needed) until the resulting string reaches the given length.

// Syntax:
// string.padStart(targetLength, padString)

// Example:

// let myName = "Yash";
console.log(myName.padStart(10, "a")); // aaaaaaYash


