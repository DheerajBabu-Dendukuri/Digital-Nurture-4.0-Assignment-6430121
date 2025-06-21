# Big-O Notation

> Big-O Notation is used to describe the **performance** or **complexity** of an algorithm in terms of time and space as the input size grows.  
> It provides an upper bound on the growth rate of an algorithm, helping us evaluate how well it scales.  
> Big-O helps in comparing algorithms by analyzing their efficiency, regardless of hardware or programming language.


## Cases in Big-O Analysis

> When analyzing an algorithm, we consider three types of performance cases:

- **Best Case**: The scenario where the algorithm performs the **least number of operations** (ideal situation).  
- **Average Case**: The expected performance in **typical conditions**, assuming a random distribution of input.  
- **Worst Case**: The scenario where the algorithm performs the **maximum number of operations** (most work done).

---

# Search Algorithms

> There are two types of search algorithms  
> 1. Linear Search  
> 2. Binary Search

## Linear Search

> Linear Search checks each index one by one until it finds the key or all the elements have been visited.  
> It follows a sequential approach and the list elements can be in any order.  
> This method is usually slower compared to Binary Search.  
> *Time Complexity: O(n)*  
> *Space Complexity: O(1)*

### Performance Cases

- **Best Case**: O(1) → When the target is at the first index.  
- **Average Case**: O(n/2) → Roughly half the elements are checked (simplified to O(n)).  
- **Worst Case**: O(n) → When the target is at the last index or not present.

---

## Binary Search

> Binary Search works based on the **divide-and-conquer** strategy.  
> It starts by finding the middle element and compares it with the key.  
> Then it narrows the search window based on the comparison result.  
> To implement Binary Search, the list **must be sorted** in advance.  
> *Time Complexity: O(log n)*  
> *Space Complexity: O(1)*

### Performance Cases

- **Best Case**: O(1) → When the target is found at the middle index in the first comparison.  
- **Average Case**: O(log n) → Logarithmic reductions based on the number of divisions.  
- **Worst Case**: O(log n) → Still logarithmic due to halving the search range each time.
