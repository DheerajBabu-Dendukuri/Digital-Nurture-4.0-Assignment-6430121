# React JS Hands-On Lab-11 (HOL)

## 1. React Events

**React events** are similar to native DOM events but are wrapped in a cross-browser wrapper called the Synthetic Event system. This ensures consistent event behavior across different browsers.  

React events can be attached to elements using JSX attributes, and they follow React’s naming conventions (camelCase).

**Example:**
```javascript
function App() {
    function handleClick() {
        alert('Button clicked!');
    }
    return <button onClick={handleClick}>Click Me</button>;
}
````

---

## 2. Event Handlers

**Event handlers** are functions that are triggered when an event occurs (e.g., click, change, submit). In React:

* Event handlers are passed as **function references**, not strings.
* They can be defined as regular functions or arrow functions.
* You can pass arguments to them using inline arrow functions.

**Example:**

```javascript
function App() {
    const handleClick = (name) => {
        alert(`Hello, ${name}`);
    };
    return <button onClick={() => handleClick('Alex')}>Greet</button>;
}
```

---

## 3. Synthetic Event

A **Synthetic Event** is React’s cross-browser wrapper around the browser’s native event. It normalizes event properties and behavior so that they work the same in all browsers.

**Key Points:**

* Pooled for performance (reused between events).
* Has the same interface as native events.
* Accessible in both class and functional components.

**Example:**

```javascript
function App() {
    function handleChange(event) {
        console.log(event.target.value); // Synthetic Event
    }
    return <input type="text" onChange={handleChange} />;
}
```

---

## 4. React Event Naming Conventions

React uses **camelCase** for event names instead of lowercase like in HTML.

**Examples:**

| HTML Event Attribute | React Event Attribute |
| -------------------- | --------------------- |
| `onclick`            | `onClick`             |
| `onchange`           | `onChange`            |
| `onmouseover`        | `onMouseOver`         |
| `onkeydown`          | `onKeyDown`           |

**Rules:**

* Event names must be written in camelCase.
* The value should be a function reference, not a string.

---