# React JS Hands-On Lab-4 (HOL)

## 1. Need and Benefits of Component Lifecycle

Need of Component Lifecycle:
Component Lifecycle methods are essential for managing the lifecycle of a component from creeation to destruction. They allow execution of code at specific points in a component's lifecycle, such as when it is created, updated, or removed from the DOM. This is crucial for tasks like fetching data, setting up subscriptions, and cleaning up resources.

Benefits of Component Lifecycle:

- Control over component behavior at different stages.
- Efficient resource management.
- Improved performance by avoiding unnecessary operations.
- Enhanced debugging capabilities by providing hooks for logging and monitoring component behavior.
- Facilitates integration with external libraries and APIs.

----

## 2. Various Lifecycle Hook Methods

Lifecycle Hook Methods are special methods in React components that allow you to run code at specific points in a component's lifecycle. These methods are called automatically by React at various stages of a component's existence.

| Lifecycle Method       | Description                                                                 |
|------------------------|-----------------------------------------------------------------------------|
| componentDidMount      | Invoked immediately after a component is mounted. Ideal for API calls.     |
| componentDidUpdate     | Invoked immediately after updating occurs. Can be used to operate on the DOM.|
| componentWillUnmount   | Invoked immediately before a component is unmounted and destroyed. Cleanup tasks can be performed here.|

----

## 3. Sequence of Steps in Rendering a Component

When a component is rendered, React follows a specific sequence of steps:

1. **Initialization**: The component is initialized, and its constructor is called.
2. **Mounting**: The component is mounted to the DOM, and the `componentDidMount` method is called.
3. **Updating**: If the component's state or props change, the `render` method is called, followed by `componentDidUpdate`.
4. **Unmounting**: When the component is removed from the DOM, the `componentWillUnmount` method is called to perform cleanup tasks.
5. **Destruction**: The component is destroyed, and any resources it was using are released.
6. **Re-rendering**: If the component's state or props change again, the cycle repeats from the updating step.
7. **Reconciliation**: React compares the new virtual DOM with the previous one to determine what changes need to be made to the actual DOM.
8. **Final Rendering**: The actual DOM is updated with the changes determined during reconciliation.
