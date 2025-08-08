def vigenere_decrypt(ciphertext, key):

    decrypted_array = []
    key_length = len(key)
    key_index = 0

    for char in ciphertext:
        if char.isalpha():
            
            shift = ord(key[key_index % key_length]) - ord('a')
            
            if char.islower():
                base = ord('a')

            else:
                base = ord("A")
            
            

            order_crypted_char = (ord(char) - base - shift) % 26 + base
            decrypted_char = chr(order_crypted_char)
            decrypted_array.append(decrypted_char)
            key_index += 1
            # print(decrypted_char)
        else:
            decrypted_array.append(char)  
            

    decrypted_meassage = ''.join(decrypted_array)
    # print(decrypted_array)

    return decrypted_meassage


# Encrypted message
cipher_text = "cmejink bh abjxbr kuz jmo jbbrtxuaf!"
key = "github"

# Decrypt and print the message
decrypted = vigenere_decrypt(cipher_text, key)
print("Decrypted message:", decrypted)
