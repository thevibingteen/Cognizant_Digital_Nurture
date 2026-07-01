# Exercise 7 - Financial Forecasting

## Objective

Predict the future value of an investment using a recursive algorithm.

---

## Recursion

Recursion is a programming technique in which a method calls itself to solve a problem. Each recursive call works on a smaller version of the original problem until a base condition is reached.

---

## Time Complexity

The recursive method performs one recursive call for each year.

- Time Complexity: **O(n)**
- Space Complexity: **O(n)** (due to the recursive call stack)

---

## Optimization

The recursive solution is easy to understand but creates multiple function calls.

Possible optimizations include:

- Using an iterative approach with a loop.
- Applying memoization when recursion solves overlapping subproblems.
- Using the direct compound interest formula when appropriate.

---

## Sample Output

```
Current Value : 10000.00
Growth Rate   : 8.00%
Years         : 5
Future Value  : 14693.28
```