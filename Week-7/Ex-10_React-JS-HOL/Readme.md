# React JS Hands-On Lab-10 (HOL)

## 1. JSX Definition

**JSX (JavaScript XML)** is a syntax extension for JavaScript used in React. It allows developers to write HTML-like code directly inside JavaScript, making it easier to create and visualize UI structures. JSX is not natively understood by browsers—it must be transpiled (usually by Babel) into standard JavaScript using `React.createElement()` calls.

**Example:**
```javascript
const element = <h1>Hello, World!</h1>;
````

---

## 2. ECMAScript Overview

**ECMAScript (ES)** is the standardized scripting language specification on which JavaScript is based. It defines the core features of the language, ensuring consistency across different implementations. Versions such as **ES5**, **ES6 (ES2015)**, and beyond introduce new features to enhance productivity and maintainability.

**Key Points:**

* Maintained by ECMA International
* Updated annually
* Foundation for JavaScript, JScript, and ActionScript

---

## 3. `React.createElement()` Explanation

`React.createElement()` is the core function that creates a React element (the building block of React UIs). JSX is syntactic sugar for this function.

**Syntax:**

```javascript
React.createElement(
    type,           // HTML tag or React component
    props,          // Attributes or properties
    ...children     // Nested elements
)
```

**Example Without JSX:**

```javascript
const element = React.createElement(
    'h1',
    { className: 'title' },
    'Hello, React!'
);
```

---

## 4. Creating React Nodes with JSX

With JSX, React nodes (elements) can be created more intuitively than with `React.createElement()`.

**Example:**

```javascript
const element = <h1 className="title">Hello, React!</h1>;
```

* JSX is compiled to `React.createElement()` during build time.
* Each JSX tag returns a React element.

---

## 5. Rendering JSX to the DOM

To display JSX content in the browser, use **`ReactDOM.render()`** (in React 17 and earlier) or **`createRoot()`** (React 18+).

**Example (React 18+):**

```javascript
import React from 'react';
import ReactDOM from 'react-dom/client';

const element = <h1>Hello, React!</h1>;
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(element);
```

---

## 6. Using JavaScript Expressions in JSX

You can embed JavaScript expressions inside JSX by enclosing them in curly braces `{}`.

**Example:**

```javascript
const name = 'Alex';
const element = <h1>Hello, {name}!</h1>;
```

* Any valid JavaScript expression (variables, function calls, calculations) can be used inside `{}`.
* Statements like `if` or `for` are not directly allowed—use expressions or conditional rendering techniques.

---

## 7. Using Inline CSS in JSX

In JSX, inline CSS is written as an object with camelCase property names.

**Example:**

```javascript
const style = {
    color: 'blue',
    fontSize: '20px'
};

const element = <h1 style={style}>Styled Text</h1>;
```

**Key Notes:**

* Properties use camelCase (`backgroundColor` instead of `background-color`).
* Values are strings, except numeric values (except where units are required).

---