# 🔢 Missing Number Finder in Java

A simple Java console program that finds the missing number in an array of distinct integers from `0` to `n`.

## 📌 Features

- Efficient solution using XOR technique.
- Handles arrays with exactly one missing number.
- Constant space and linear time complexity.

---

## ✅ Example Output
  
Missing number: 8

---

## 🧠 How It Works

- XOR all numbers from `0` to `n`
- XOR all elements in the array  
- The result is the missing number, as duplicates cancel out with XOR