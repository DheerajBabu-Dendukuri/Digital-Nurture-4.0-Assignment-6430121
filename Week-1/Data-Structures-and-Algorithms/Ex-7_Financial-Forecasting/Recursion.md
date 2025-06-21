# Recursion

> Recursion is a process in which a function or procedure **calls itself**, either directly or indirectly, until a **base condition** is met.  
> It is widely used in many algorithms, especially in problems that can be broken down into **smaller subproblems**.

## When to Use Recursion

> Recursion is particularly useful when:
> - A task needs to be **repeated** in a self-similar way.
> - A problem can be broken down into **simpler versions** of the same problem.
> - The structure of the problem is **inherently recursive**, such as tree traversal, factorial calculation, Fibonacci sequence, etc.

## Key Concepts

- **Recursive Case**: The part of the function that includes the recursive call to solve a smaller problem.
- **Base Case**: The condition that stops the recursion and prevents infinite loops.

## Example Use Cases

> - **Factorial Calculation**
> - **Fibonacci Sequence**
> - **Tree and Graph Traversals**
> - **Divide-and-Conquer Algorithms** (e.g., Merge Sort, Quick Sort)

## Advantages

> - Simplifies complex problems through cleaner, shorter code.
> - Naturally mirrors problems that are hierarchical or nested in nature.

## Disadvantages

> - Higher memory usage due to **call stack overhead**.
> - Risk of **stack overflow** if base case is not defined or not reached.

