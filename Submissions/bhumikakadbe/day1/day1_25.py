import string

def autokey_cipher(text, key, mode='encrypt'):
    """Encrypt or decrypt text using the Autokey Cipher, preserving non-alphabetic characters."""
    alphabet = string.ascii_uppercase
    key = ''.join(filter(str.isalpha, key)).upper()
    result = []
    key_index = 0
    key_stream = key

    for char in text:
        if char.isalpha():
            char_up = char.upper()
            key_char = key_stream[key_index % len(key_stream)]
            shift = alphabet.index(key_char)
            if mode == 'encrypt':
                cipher_char = alphabet[(alphabet.index(char_up) + shift) % len(alphabet)]
                key_stream += cipher_char  # For autokey, append cipher to key
            elif mode == 'decrypt':
                cipher_char = alphabet[(alphabet.index(char_up) - shift) % len(alphabet)]
                key_stream += char_up  # For autokey, append plain to key
            # Preserve original case
            if char.islower():
                cipher_char = cipher_char.lower()
            result.append(cipher_char)
            key_index += 1
        else:
            result.append(char)
    return ''.join(result)

# Example usage
message = input("Enter the message: ")
key = "BhumikaKadbe"
encrypted = autokey_cipher(message, key, mode='encrypt')
decrypted = autokey_cipher(encrypted, key, mode='decrypt')

print("Original Message:", message)
print("Encrypted Message:", encrypted)
print("Decrypted Message:", decrypted)
