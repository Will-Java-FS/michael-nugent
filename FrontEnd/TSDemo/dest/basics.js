"use strict";
let isSunny = true; //boolean
let numberOne = 1; //number
let word = "Hello, World!";
let bigNumber;
let car = "toyota"; //type inference
let numbers = [1, 2, 3, 4]; //array
let words = ["Hello", "Hey", "Hi"]; //this is using generics!
function add(a, b) {
    return a + b;
}
// let incrementor = (c: number): number => {
//     return c + 1;
// }
let incrementor = (c) => c;
console.log("Hello, Y'all!", word, add(1, 2), incrementor(1));
let myTuple;
myTuple = ['pizza', 19, false];
myTuple.push("new value");
console.log(myTuple);
let myArray = ['myString', 12, 14, 'test'];
console.log(myArray);
/*
Benefits of TypeScript: compiler caught type errors
TypeScript file extension: .ts
TypeScript requires more unit tests that JavaScript: false
What does TSC stand for? What does it do?  Transcompiler converts typescript code to javascript.
*/
/*
Which file indicates the root of a TypeScript project? tsconfig.json
What does the 'target' property do?  Sets the JavaScript language version.
What is strict mode?
*/
var testEnum;
(function (testEnum) {
    testEnum[testEnum["enum1"] = 0] = "enum1";
    testEnum[testEnum["enum2"] = 1] = "enum2";
    testEnum[testEnum["enum3"] = 2] = "enum3";
})(testEnum || (testEnum = {}));
console.log(`enum1: ${testEnum.enum1}`);
/*
What is another name for simple types?  Primitives?
Which special type disables type checking? Any.
What allows us to define types with custom names?  Alias?  Type?
What do union types allow for?  Multiple types.
_____ are types arrays with a predefined length and type for each index.  Tuples.
A set of named constants in TypeScript is called _____: enum
These have an auto increment function.  Numerical enums.
*/
