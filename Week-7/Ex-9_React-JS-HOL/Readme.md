# React JS Hands-On Lab-9 (HOL)

## 1. Features of ES6

ECMAScript 6 (ES6), also known as ECMAScript 2015, introduced significant improvements to JavaScript, making it more powerful, readable, and maintainable.

**Key Features:**

* **`let`** and **`const`** for block-scoped variables
* **Arrow Functions** for concise syntax
* **Template Literals** for easier string manipulation
* **Default Parameters** in functions
* **Rest and Spread Operators** (`...`)
* **Destructuring Assignment** for arrays and objects
* **Modules** (`import`/`export`)
* **Classes** and **Inheritance**
* **Promises** for asynchronous operations
* **`Map`** and **`Set`** data structures

---

## 2. JavaScript let

The **`let`** keyword declares variables that are **block-scoped** (limited to the block in which they are defined).

**Characteristics:**

* Can be reassigned but not redeclared in the same scope.
* Not hoisted in the same way as `var` (Temporal Dead Zone applies).
* Improves code readability and reduces accidental variable overwrites.

**Example:**

```javascript
let count = 10;
if (true) {
    let count = 5; // Different variable from the outer count
    console.log(count); // Output: 5
}
console.log(count); // Output: 10
````

-----

## 3\. Difference Between `var` and `let`

| Feature | `var` | `let` |
| :--- | :--- | :--- |
| **Scope** | Function-scoped | Block-scoped |
| **Redeclaration** | Allowed | Not allowed in the same scope |
| **Hoisting** | Hoisted (initialized as `undefined`) | Hoisted but in Temporal Dead Zone |
| **Best Use Case** | Legacy code compatibility | Modern, block-specific variables |

-----

## 4\. JavaScript const

The **`const`** keyword declares block-scoped variables that **cannot be reassigned**.

**Characteristics:**

* Must be initialized at the time of declaration.
* The value cannot be reassigned, but objects and arrays can still be mutated.
* Encourages immutable coding practices.

**Example:**

```javascript
const PI = 3.1416;
const user = { name: "Alex" };
user.name = "Jordan"; // Allowed (mutation)
```

-----

## 5\. ES6 Class Fundamentals

ES6 introduced **`class`** syntax as a more readable way to create constructor functions and prototypes.

**Characteristics:**

* Encapsulation of methods and properties.
* `constructor` method for initialization.
* Defined using the `class` keyword.

**Example:**

```javascript
class Person {
    constructor(name) {
        this.name = name;
    }

    greet() {
        console.log(`Hello, my name is ${this.name}`);
    }
}
```

-----

## 6\. ES6 Class Inheritance

Inheritance in ES6 allows one class to extend another using the **`extends`** keyword.

**Example:**

```javascript
class Student extends Person {
    constructor(name, grade) {
        super(name); // Calls the parent class constructor
        this.grade = grade;
    }

    study() {
        console.log(`${this.name} is studying in grade ${this.grade}`);
    }
}
```

-----

## 7\. ES6 Arrow Functions

Arrow functions provide a shorter syntax for defining functions and lexically bind the **`this`** keyword.

**Example:**

```javascript
const add = (a, b) => a + b;
```

**Key Advantages:**

* Shorter syntax
* No `this` binding issues
* Cannot be used as constructors

-----

## 8\. Set and Map in ES6

### Set

A collection of **unique** values. It is useful for removing duplicates from an array.

**Example:**

```javascript
const numbers = new Set([1, 2, 3, 3]);
console.log(numbers); // Output: Set {1, 2, 3}
```

**Map**

A collection of key-value pairs where keys can be of any data type. It maintains the insertion order of keys.

**Example:**

```javascript
const userMap = new Map();

userMap.set("name", "Alex");
userMap.set("age", 25);

console.log(userMap.get("name")); // Output: Alex
```