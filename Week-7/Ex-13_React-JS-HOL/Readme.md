# React JS Hands-On Lab-13 (HOL)

## 1. Conditional Rendering in React

**Conditional rendering** in React means displaying different UI elements depending on certain conditions, similar to how conditions work in JavaScript.  

**Common Approaches:**
- **`if` Statements**
```javascript
if (isLoggedIn) {
    return <Dashboard />;
} else {
    return <Login />;
}
````

* **Ternary Operator**

```javascript
return isLoggedIn ? <Dashboard /> : <Login />;
```

* **Logical AND (`&&`)**

```javascript
return isAdmin && <AdminPanel />;
```

* **Switch Case (via functions)**

```javascript
function renderPage(page) {
    switch (page) {
        case 'home': return <Home />;
        case 'about': return <About />;
        default: return <NotFound />;
    }
}
```

---

## 2. Rendering Multiple Components

You can render multiple components by returning them in:

* **A single parent element**

```javascript
return (
    <div>
        <Header />
        <Content />
        <Footer />
    </div>
);
```

* **React Fragments** (`<>...</>`) to avoid extra DOM nodes:

```javascript
return (
    <>
        <Header />
        <Content />
        <Footer />
    </>
);
```

* **Array of Elements** with keys:

```javascript
return [
    <Header key="h" />,
    <Content key="c" />,
    <Footer key="f" />
];
```

---

## 3. List Component

A **list component** displays data collections by mapping each item to a React element.
**Example:**

```javascript
function ItemList(props) {
    return (
        <ul>
            {props.items.map(item => <li key={item.id}>{item.name}</li>)}
        </ul>
    );
}
```

---

## 4. Keys in React Applications

**Keys** are unique identifiers that help React identify which items in a list have changed, been added, or removed. They improve rendering performance and prevent UI bugs.

**Rules:**

* Must be unique among siblings.
* Prefer stable IDs over array indexes.
* Placed on the outermost element returned by `map()`.

**Example:**

```javascript
items.map(item => <li key={item.id}>{item.name}</li>)
```

---

## 5. Extracting Components with Keys

When splitting a list into smaller components, pass the key directly to the component instance—not inside the component as a prop for rendering logic.

**Example:**

```javascript
function ListItem({ value }) {
    return <li>{value}</li>;
}

function ItemList({ items }) {
    return (
        <ul>
            {items.map(item => <ListItem key={item.id} value={item.name} />)}
        </ul>
    );
}
```

---

## 6. React Map and `map()` Function

The **`map()`** function in JavaScript is commonly used in React to transform arrays into lists of elements.

**Example:**

```javascript
const numbers = [1, 2, 3, 4];
const listItems = numbers.map(num => <li key={num}>{num}</li>);

return <ul>{listItems}</ul>;
```

**Key Points:**

* `map()` returns a new array without mutating the original.
* Always assign a unique `key` when rendering lists.

---
