# React JS Hands-On Lab-3 (HOL)

## 1. React Components

**React Components** are the building blocks of a React Application. They are reusable pieces of code that define how a part of the UI should look and behave. They are independent units written in JSX (JavaScript XML) that can manage their own state and lifecycle.

----

## 2. Difference between Components and JavaScript Functions

| Feature                | React Components            | JavaScript Functions          |
|------------------------|-----------------------------|-------------------------------|
| Purpose                | Define UI elements          | Perform actions or calculations |
| State Management       | Can manage state            | Stateless                     |
| Lifecycle              | Have lifecycle methods      | No lifecycle                  |
| Reusability            | Highly reusable             | Less reusable                 |
| Rendering              | Render UI                   | Return values                 |
| Syntax                 | JSX syntax                  | Standard JavaScript syntax    |
| Usage                  | Used in UI development      | General programming tasks     |

----

## 3. Types of Components

There are two main types of React components:

- **Class Components**: These are ES6 classes that extend `React.Component`. They can hold and manage their own state and lifecycle methods.  
- **Function Components**: These are simpler components defined as JavaScript functions. They can use hooks to manage state and lifecycle methods in modern React.

----

## 4. Class Component

**Class Components** are ES6 classes that extend `React.Component`. They can hold and manage their own state and lifecycle methods. Class components are typically used when you need to manage complex state or lifecycle events.

----

## 5. Function Component

**Function Components** are simpler components defined as JavaScript functions. They can use hooks to manage state and lifecycle methods in modern React.

----

## 6. Component Constructor

The **Component Constructor** is a special method in class components that is called when the component is created. It initializes the component's state and binds methods to the component instance. The constructor is defined using the `constructor` keyword and must call `super(props)` to access `this.props`.

----

## 7. render() Function

The `render()` function is a required method in class components that returns the JSX to be rendered. It defines what the UI should look like for that component. The `render()` method can access `this.props` and `this.state` to dynamically render content based on the component's state and properties.

----
