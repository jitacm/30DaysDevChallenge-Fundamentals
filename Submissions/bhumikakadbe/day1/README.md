# Day 1 - Python Challenge

## File: day1_25.py

### Description
This script implements the Autokey Cipher, a polyalphabetic substitution cipher, as part of the 30 Days Dev Challenge - Fundamentals. It demonstrates string manipulation, user input handling, and encryption/decryption logic in Python.

### How to Run
1. Make sure you have Python installed (version 3.x recommended).
2. Open a terminal or command prompt in this directory.
3. Run the script using:
   ```powershell
   python day1_25.py
   ```

### Code Logic
- The script defines a function to both encrypt and decrypt messages using the Autokey Cipher.
- The cipher works by using a key to shift each letter of the message. For encryption, the key is extended by appending each encrypted character; for decryption, it is extended by appending each decrypted (plain) character.
- Non-alphabetic characters are preserved as-is.
- The function preserves the original case (uppercase/lowercase) of each letter.
- The script prompts the user to enter a message, encrypts it using the key `BhumikaKadbe`, then decrypts it to show the original message.

### Summary
This script is a practical demonstration of the Autokey Cipher in Python. It highlights the use of string operations, control flow, and user interaction. The code is easy to modify for experimenting with different keys or messages, making it a useful learning tool for cryptography fundamentals and Python programming.

---