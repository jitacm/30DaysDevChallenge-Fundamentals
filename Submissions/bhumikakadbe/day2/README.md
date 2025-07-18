# 🔍 Missing Number Finder using XOR | Python Script

This project is a Python-based solution to efficiently find a missing number from a sequence of `n` distinct integers ranging from `0` to `n`. It demonstrates the use of bit manipulation (XOR operation) for optimal performance.

---

## 📘 Problem Overview

Given a list containing `n` distinct numbers from the range `[0, n]`, exactly one number is missing. Your task is to identify the missing number.

### ✅ Example:
Input: 0 1 2 4 5 6 (n = 6)

Output: 3


---

## 💡 Solution Approach

This program uses the **bitwise XOR** technique:

### Why XOR?
- XOR has a property: `a ^ a = 0` and `a ^ 0 = a`
- If we XOR all numbers from `0 to n` and XOR all elements in the list, the result will be the **missing number**

### Time and Space Complexity:
| Metric | Value |
|--------|-------|
| Time Complexity | `O(n)` |
| Space Complexity | `O(1)` |

---

## 🛠️ How the Program Works

1. User enters a number `n` (the maximum in the range).
2. User inputs `n` distinct numbers from the range `0 to n`, missing one.
3. The script calculates the missing number using XOR.
4. Displays the result.

---



## ▶️ Usage Instructions

### 🐍 Run the Script:
```bash
python dayX_missing_number.py
🧑‍💻 Sample Input:

Enter the value of n (the maximum number in the range): 5
Enter the numbers separated by spaces: 0 1 3 4 5
✅ Output:

Missing number is: 2
📥 Sample Input Validations
Ensures user enters exactly n numbers.

Validates if all numbers are within the range 0 to n.

Ensures numbers are distinct.


🧑‍🎓 Author
👩‍💻 Bhumika Kadbe
📬 Email: bhumikakadbe@gmail.com
🌐 GitHub: bhumikakadbe

