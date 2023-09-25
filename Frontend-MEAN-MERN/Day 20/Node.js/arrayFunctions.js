// Array functions

// 1. concat()
// This function is used to join two or more arrays and returns a new array.
// Syntax:
// array1.concat(array2, array3, ..., arrayX)
// Example:
// let myArray = [1, 2, 3];
// let myArray2 = [4, 5, 6];
// console.log(myArray.concat(myArray2)); // [1, 2, 3, 4, 5, 6]

// 2. copyWithin()
// This function copies a part of an array to another location in the same array and returns it, without modifying its size.
// Syntax:
// array.copyWithin(target, start, end)
// Example:

// let myArray = [1, 2, 3, 4, 5];
// console.log(myArray.copyWithin(0, 3)); // [4, 5, 3, 4, 5]
// In the above example, we are copying the elements from index 3 to the end of the array to the start of the array.

// 3. entries()
// This function returns a new Array Iterator object that contains the key/value pairs for each index in the array.
// Syntax:
// array.entries()
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.entries()); // Object [Array Iterator] {}

// 4. every()
// This function checks if all the elements in an array pass a test.
// Syntax:
// array.every(function(currentValue, index, arr), thisValue)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.every((element) => element > 0)); // true
// console.log(myArray.every((element) => element > 1)); // false

// 5. fill()
// This function fills the specified elements in an array with a static value.
// Syntax:
// array.fill(value, start, end)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.fill(0, 1)); // [1, 0, 0]
// console.log(myArray.fill(1, 1, 2)); // [1, 1, 0]
// In the above example, we are filling the elements from index 1 to index 2 with 1. So, the element at index 1 will be replaced with 1 and the element at index 2 will be replaced with 1. The element at index 0 will remain the same. So, the output will be [1, 1, 0].

// 6. filter()
// This function creates a new array with all the elements that pass the test implemented by the provided function.
// Syntax:
// array.filter(function(currentValue, index, arr), thisValue)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.filter((element) => element > 1)); // [2, 3]
// console.log(myArray.filter((element) => element > 2)); // [3]

// 7. find()
// This function returns the value of the first element in an array that pass the test implemented by the provided function.
// Syntax:
// array.find(function(currentValue, index, arr),thisValue)
// Example:
// let myArray = [1, 2, 3, 4, 5, 1, 2, 3, 1];
// console.log(myArray.find((element) => element > 1)); // 2
// console.log(myArray.find((element) => element > 2)); // 3
// console.log(myArray.find((element) => element > 3)); // 4
// console.log(myArray.find((element) => element > 4)); // 5
// console.log(myArray.find((element) => element > 5)); // undefined

// In the above example, we are finding the first element that is greater than 1, 2, 3, 4, and 5. So, the output will be 2, 3, 4, 5, and undefined respectively. The output will be undefined because there is no element greater than 5. So, the find() function returns undefined.

// 8. findIndex()
// This function returns the index of the first element in an array that pass the test implemented by the provided function.
// Syntax:
// array.findIndex(function(currentValue, index, arr),thisValue)
// Example:
// let myArray = [1, 2, 3, 4, 5, 1, 2, 3, 1];
// console.log(myArray.findIndex((element) => element > 1)); // 1
// console.log(myArray.findIndex((element) => element > 2)); // 2
// console.log(myArray.findIndex((element) => element > 3)); // 3

// In the above example, we are finding the index of the first element that is greater than 1, 2, and 3. So, the output will be 1, 2, and 3 respectively.

// 9. forEach()
// This function calls a function once for each element in an array, in order.
// Syntax:
// array.forEach(function(currentValue, index, arr), thisValue)
// Example:
// let myArray = [1, 2, 3];
// myArray.forEach((element) => console.log(element)); // 1 2 3

// 10. includes()

// This function checks whether an array contains the specified element and returns true or false.
// Syntax:
// array.includes(element, start)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.includes(1)); // true
// console.log(myArray.includes(4)); // false

// 11. indexOf()
// This function returns the index of the first occurrence of the specified element in an array.
// Syntax:
// array.indexOf(element, start)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.indexOf(1)); // 0
// console.log(myArray.indexOf(2)); // 1
// console.log(myArray.indexOf(3)); // 2

// 12. join()
// This function joins all the elements of an array into a string.
// Syntax:
// array.join(separator)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.join()); // 1,2,3
// console.log(myArray.join("")); // 123
// console.log(myArray.join(" ")); // 1 2 3
// console.log(myArray.join("-")); // 1-2-3

// 13. keys()
// This function returns a new Array Iterator object that contains the keys for each index in the array.
// Syntax:
// array.keys()
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.keys()); // Object [Array Iterator] {}

// 14. lastIndexOf()
// This function returns the index of the last occurrence of the specified element in an array.
// Syntax:
// array.lastIndexOf(element, start)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.lastIndexOf(1)); // 0
// console.log(myArray.lastIndexOf(2)); // 1
// console.log(myArray.lastIndexOf(3)); // 2

// 15. map()
// This function creates a new array with the results of calling a function for every array element.
// Syntax:
// array.map(function(currentValue, index, arr), thisValue)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.map((element) => element * 2)); // [2, 4, 6]

// 16. pop()
// This function removes the last element from an array and returns it.
// Syntax:
// array.pop()
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.pop()); // 3
// console.log(myArray); // [1, 2]

// 17. push()
// This function adds one or more elements to the end of an array and returns the new length of the array.
// Syntax:
// array.push(element1, element2, ..., elementX)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.push(4)); // 4
// console.log(myArray); // [1, 2, 3, 4]

// 18. reduce()
// This function reduces the array to a single value.
// Syntax:
// array.reduce(function(total, currentValue, currentIndex, arr), initialValue)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.reduce((total, element) => total + element)); // 6

// 19. reduceRight()
// This function reduces the array to a single value from right to left.
// Syntax:
// array.reduceRight(function(total, currentValue, currentIndex, arr), initialValue)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.reduceRight((total, element) => total + element)); // 6

// 20. reverse()
// This function reverses the order of the elements in an array.
// Syntax:
// array.reverse()
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.reverse()); // [3, 2, 1]

// 21. shift()
// This function removes the first element from an array and returns it.
// Syntax:
// array.shift()
// Example:

// let myArray = [1, 2, 3];
// console.log(myArray.shift()); // 1
// console.log(myArray); // [2, 3]

// 22. slice()
// This function returns a shallow copy of a portion of an array into a new array.
// Syntax:
// array.slice(start, end)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.slice(1)); // [2, 3]
// console.log(myArray.slice(1, 2)); // [2]

// 23. some()
// This function checks if any of the elements in an array pass a test.
// Syntax:
// array.some(function(currentValue, index, arr), thisValue)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.some((element) => element > 1)); // true
// console.log(myArray.some((element) => element > 2)); // true
// console.log(myArray.some((element) => element > 3)); // false

// 24. sort()
// This function sorts the elements of an array.
// Syntax:
// array.sort(compareFunction)
// Example:
// let myArray = [3, 2, 1];
// console.log(myArray.sort()); // [1, 2, 3]

// 25. splice()
// This function adds/removes items to/from an array and returns the removed item(s).
// Syntax:
// array.splice(index, howmany, item1, ....., itemX)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.splice(1, 1)); // [2]

// 26. toLocaleString()
// This function converts an array to a string, using a local language format.
// Syntax:
// array.toLocaleString(locales, options)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.toLocaleString()); // 1,2,3

// 27. toString()
// This function converts an array to a string.
// Syntax:
// array.toString()
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.toString()); // 1,2,3

// 28. unshift()
// This function adds one or more elements to the beginning of an array and returns the new length of the array.
// Syntax:
// array.unshift(element1, element2, ..., elementX)
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.unshift(4)); // 4
// console.log(myArray); // [4, 1, 2, 3]

// 29. valueOf()
// This function returns the primitive value of an array.
// Syntax:
// array.valueOf()
// Example:
// let myArray = [1, 2, 3];
// console.log(myArray.valueOf()); // [1, 2, 3]
//
