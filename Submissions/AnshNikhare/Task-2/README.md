# 🧩 Missing Number Finder – Day 2

A simple Java solution to find the missing number from an array using bitwise XOR.

---

## ✅ The Missing Number

### **8**

---

## 🧠 Explanation

- We XOR all numbers from `0` to `n` (inclusive), and also XOR all elements of the array.
- Since every number that appears in both will cancel out, the only number left will be the missing one.
- This approach runs in O(n) time and uses only O(1) space.

---

