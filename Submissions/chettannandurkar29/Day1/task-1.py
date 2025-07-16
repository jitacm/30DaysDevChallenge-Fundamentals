def vigenere_decrypt(cipher_text, key):
    decrypted = []
    key = key.lower()
    key_length = len(key)
    key_index = 0

    for char in cipher_text:
        if char.isalpha():
            shift = ord(key[key_index % key_length]) - ord('a')
            base = ord('a') if char.islower() else ord('A')
            # Decrypt character
            decrypted_char = chr((ord(char) - base - shift) % 26 + base)
            decrypted.append(decrypted_char)
            key_index += 1
        else:
            decrypted.append(char)  # Keep non-alphabet characters unchanged

    return ''.join(decrypted)

def vigenere_decrypt(cipher_text, key):
    decrypted = []
    key = key.lower()
    key_length = len(key)
    key_index = 0

    for char in cipher_text:
        if char.isalpha():
            shift = ord(key[key_index % key_length]) - ord('a')
            base = ord('a') if char.islower() else ord('A')
            # Decrypt character
            decrypted_char = chr((ord(char) - base - shift) % 26 + base)
            decrypted.append(decrypted_char)
            key_index += 1
        else:
            decrypted.append(char)  # Keep non-alphabet characters unchanged

    return ''.join(decrypted)

# Inputs
encrypted_message = "cmejink bh abjxbr kuz jmo jbbrtxuaf!"
key = "github"

# Decryption
decrypted_message = vigenere_decrypt(encrypted_message, key)
print("Decrypted message:", decrypted_message)
