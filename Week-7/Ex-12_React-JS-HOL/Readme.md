# React JS Hands-On Lab-12 (HOL)

## 1. Conditional Rendering in React

**Conditional rendering** in React works just like conditions in JavaScript—React uses conditional logic to decide which elements or components to display.  

**Common Methods:**
- **If/Else Statements**
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

* **Conditional Function Calls**

```javascript
function renderPage(page) {
    if (page === 'home') return <Home />;
    if (page === 'about') return <About />;
    return <NotFound />;
}
```

---

## 2. Element Variables

**Element variables** store elements in variables so they can be conditionally rendered later.

**Example:**

```javascript
let button;
if (isLoggedIn) {
    button = <LogoutButton />;
} else {
    button = <LoginButton />;
}

return (
    <div>
        {button}
    </div>
);
```

**Key Points:**

* Helps keep JSX clean by separating logic from return statements.
* Useful for complex condition checks.

---

## 3. Preventing Components from Rendering

Sometimes you may want a component to **not render anything** under certain conditions. This can be done by returning `null` from the component’s render function.

**Example:**

```javascript
function WarningBanner({ show }) {
    if (!show) {
        return null; // Prevent rendering
    }
    return <div className="warning">Warning!</div>;
}
```

**Key Points:**

* Returning `null` prevents the component from rendering in the DOM.
* The component’s lifecycle methods (if any) will still run.

---