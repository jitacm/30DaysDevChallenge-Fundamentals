# 🧩 Day 1 Task – Vigenère Cipher Decryption

Welcome to **Day 1** of the 30 Days Dev Challenge - Fundamentals!
Today's task will test your understanding of classical encryption and your ability to implement logic from a problem description.

## 📝 Task Description

You are given:

* An **encrypted message**:

  ```
  cmejink bh abjxbr kuz jmo jbbrtxuaf!
  ```

* A **custom key**:

  ```
  github
  ```

The encryption used is based on the **Vigenère Cipher** — a classical cipher that encrypts and decrypts messages using a repeated keyword.

Your task is to:

1. **Implement a function** that can **decrypt the message** using the Vigenère Cipher technique and the key provided.
2. Submit the **decrypted message** and a brief explanation of how your code works.

🔐 What is the Vigenère Cipher?
The Vigenère Cipher is a method of encrypting alphabetic text by using a series of Caesar ciphers based on the letters of a keyword.

Unlike a standard Caesar cipher, which shifts every letter by the same amount, the Vigenère Cipher shifts each letter of the message by a different amount depending on the corresponding letter in a repeating key.

🧠 How It Works:
1. Choose a keyword (e.g., key or hooray).
2. Repeat the keyword to match the length of the message.
3. For each letter in the message:
4. Find its position in the alphabet (0–25).
5. Find the position of the corresponding letter in the keyword.
6. Encryption: Add the two positions, then wrap around using modulo 26.
7. Decryption: Subtract the key letter’s position instead.
8. Non-alphabetic characters (like spaces or numbers) are left unchanged.

📘 Example:
`Message: hello`
`Key: keyke`
`Encrypted: rijvs`
(Using the shifts from 'k', 'e', 'y', 'k', 'e' respectively)

## 📂 Submission Format

Inside your folder `/submissions/your_username/day1/`, include:

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

