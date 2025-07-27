# React JS Hands-On Lab-1 (HOL)

## 1. Single Page Applicaion (SPA) and its Benefits

**A Single Page Application (SPA)** is a web application that dynamically updates the content of a single web page without requiring a full page relaod. It relies on Client-Side Rendering (CSR) to load contents asynchronously, providing a smoother user experience similar to that of a desktop application.

**Benefits of SPA:**

- Improved User Experience
- Reduced Server Load
- Faster Load Times
- Seamless Navigation

----

## 2. React Definition and its Working

**React** is a JavaScript library developed by Facebook. It is used for creating user interfaces, especially for SPA. It uses components to build reusable UI elements, allowing developers to create complex UIs from simple building blocks.

**React** works by using Virtual DOM (a lightweight copy of the actual DOM) to update the UI. It uses the process called Reconciliation to update the Virtual DOM and then efficiently updates the actual DOM only when necessary, minimizing performance overhead.

----

## 3. Difference between SPA and MPA

**Single Page Application (SPA)** vs **Multi-Page Application (MPA)**:

| Feature                | Single Page Application (SPA) | Multi-Page Application (MPA) |
|------------------------|-------------------------------|-------------------------------|
| Page Load              | Single HTML page              | Multiple HTML pages           |
| Navigation             | Client-side routing           | Server-side routing           |
| Performance            | Faster, less data transfer    | Slower, more data transfer    |
| Development            | More complex, requires JS     | Simpler, traditional approach  |

----

## 4. Pros and Cons of SPA

**Pros of SPA:**

- Faster navigation and interactions
- Reduced server load
- Improved user experience
- Easier to implement caching

**Cons of SPA:**

- SEO challenges
- Initial load time can be longer
- JavaScript dependency
- Browser history management can be complex

----

## 5. Virtual DOM

**Virtual DOM (VDOM)** is a lightweight representation of the actual DOM. It updates the UI by comparing the current VDOM with the previous version and applying only the necessary changes to the actual DOM.

----

## 6. Features of React

- Component-Based Architecture
- Declarative UI
- Unidirectional Data Flow
- JSX (JavaScript XML)
- Hooks
- Strong Community Support
