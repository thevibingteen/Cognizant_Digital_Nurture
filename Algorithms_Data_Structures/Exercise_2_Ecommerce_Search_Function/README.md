# Exercise 2 - E-commerce Platform Search Function

## Objective

Implement linear search and binary search for searching products in an e-commerce platform.

---

## Big O Notation

Big O notation is used to measure how the running time of an algorithm grows as the input size increases. It helps compare the efficiency of different algorithms.

### Search Complexity

| Algorithm | Best | Average | Worst |
|-----------|------|---------|-------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

---

## Analysis

### Linear Search

- Checks each element one by one.
- Works on both sorted and unsorted data.
- Suitable for small collections.

### Binary Search

- Works only on sorted data.
- Repeatedly divides the search space into halves.
- Much faster for large datasets.

For an e-commerce platform containing thousands of products, binary search is generally more efficient because it reduces the number of comparisons significantly.

---

## Output

```
Linear Search:
104 - Watch (Accessories)

Binary Search:
104 - Watch (Accessories)
```