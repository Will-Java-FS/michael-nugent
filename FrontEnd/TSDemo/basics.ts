
let isSunny: boolean = true; //boolean
let numberOne: number = 1; //number
let word: string = "Hello, World!";
let bigNumber: bigint;

let car = "toyota"; //type inference

let numbers: number[] = [1, 2, 3, 4];//array
let words: Array<string> = ["Hello", "Hey", "Hi"]; //this is using generics!

function add(a: number, b: number): number {
    return a + b;
}

// let incrementor = (c: number): number => {
//     return c + 1;
// }

let incrementor = (c: number): number => c;

console.log("Hello, Y'all!", word, add(1, 2), incrementor(1));

let myTuple: [string,number,boolean];
myTuple = ['pizza',19,false];
myTuple.push("new value");
console.log(myTuple);

let myArray: (string | number)[] = ['myString',12,14,'test'];
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

enum testEnum{
    enum1,
    enum2,
    enum3
}

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
