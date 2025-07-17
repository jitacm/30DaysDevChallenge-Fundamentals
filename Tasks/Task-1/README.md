# 🧩 Day 1 Task – Vigenère Cipher Decryption

Welcome to **Day 1** of the 30 Days Dev Challenge - Fundamentals!
Today's task will test your understanding of classical encryption and your ability to implement logic from a problem description.

## 📝 Task Description

You are given:

* An **encrypted message**:

  ```
  mrttaqrhknsw ih puggrur
  ```

* A **custom key**:

  ```
  python
  ```

The encryption used is based on the **Vigenère Cipher** — a classical cipher that encrypts and decrypts messages using a repeated keyword.

Your task is to:

1. **Implement a function** that can **decrypt the message** using the Vigenère Cipher technique and the key provided.
2. Submit the **decrypted message** and a brief explanation of how your code works.

## 🧠 How the Vigenère Cipher Works (Decryption)

* Use a keyword (in this case: `python`) to determine how much to shift each letter in the message.
* Repeat the keyword so it matches the length of the message.
* For each letter in the message:

  * Find its position in the alphabet.
  * Find the position of the corresponding letter in the keyword.
  * **Subtract** the keyword letter’s position from the message letter’s position.
  * Wrap around the alphabet if needed (i.e., modulo 26).
* Ignore spaces and non-alphabetic characters — just add them as-is to the result.

## 📂 Submission Format

Inside your folder `/submissions/your_username/Task-1/`, include:

* `solution.txt` or `README.md`
  Containing:

  * ✅ The **decrypted message**
  * 🧠 A short **explanation** of your logic (2–3 lines)


## 🏆 Points

* Completing this task successfully earns you **10 points**.

## ⚠️ Rules

* 🚫 Do **not** use ChatGPT or any AI tools to solve or generate code.
* ✅ You may use any of the allowed languages: **Python, C/C++, Java, or JavaScript**.
* 🧠 Implement the logic yourself — no copying or plagiarism.
* 📅 Submit your solution before the deadline to earn your points.

Good luck on Day 1!
Start strong, and keep your streak alive. 🔓🔥

