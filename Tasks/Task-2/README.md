# 🧩 Day 2 Task – Missing Number Finder

Welcome to **Day 2** of the 30 Days Dev Challenge - Fundamentals\!
Today's task will test your understanding of bitwise operations and your ability to optimize for space and time complexity.

## 📝 Task Description

You are given:

  * An **array of integers** `nums`:

    ```
    [9, 6, 4, 2, 3, 5, 7, 0, 1]
    ```

The array `nums` contains `n` distinct numbers in the range `[0, n]`. This means that exactly one number in the range is missing from the array.

Your task is to:

1.  **Implement a function** that can **find the missing number** in the given array.
2.  Submit the **missing number** and a brief explanation of how your code works.

## 🧠 How to Find the Missing Number (Bitwise Approach)

  * The key to solving this efficiently lies in the properties of the **bitwise XOR (exclusive OR)** operator.
  * Recall that:
      * `x ^ x = 0` (XORing a number with itself results in zero)
      * `x ^ 0 = x` (XORing a number with zero results in the number itself)
      * XOR is associative and commutative: `a ^ b ^ c = a ^ (b ^ c) = (a ^ b) ^ c`
  * Consider the XOR sum of all numbers from `0` to `n` (inclusive).
  * Consider the XOR sum of all numbers present in the `nums` array.
  * If you XOR these two sums together, what remains will be the missing number. Why? Because all the numbers that are present in both sets will cancel each other out (due to `x ^ x = 0`), leaving only the single number that was missing.
  * You must implement a solution with **linear runtime complexity** (O(n)) and **constant extra space complexity** (O(1)).

## 📂 Submission Format

Inside your folder `/submissions/your_username/Task-2/`, include:

  * `solution.txt` or `README.md`
    Containing:

      * ✅ The **missing number**
      * 🧠 A short **explanation** of your logic (2–3 lines)

## 🏆 Points

  * Completing this task successfully earns you **10 points**.

## ⚠️ Rules

  * 🚫 Do **not** use ChatGPT or any AI tools to solve or generate code.
  * ✅ You may use any of the allowed languages: **Python, C/C++, Java, or JavaScript**.
  * 🧠 Implement the logic yourself — no copying or plagiarism.
  * 📅 Submit your solution before the deadline to earn your points.

Good luck on Day 2\!
Start strong, and keep your streak alive. 🔓🔥