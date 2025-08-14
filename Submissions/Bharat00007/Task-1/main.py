def decrypt_message(cipher_text: str, key: str) -> str:
    result = []
    key_pos = 0
    key_len = len(key)
    
    for c in cipher_text:
        if not c.isalpha():
            result.append(c)
            continue
     
        shift = ord(key[key_pos % key_len].lower()) - ord('a') 
        char_pos = ord(c.lower()) - ord('a')
        new_pos = (char_pos - shift) % 26
        decoded = chr(new_pos + ord('a'))
        result.append(decoded.upper() if c.isupper() else decoded)
        key_pos += 1
        
    return ''.join(result)

secret = "cmejink bh abjxbr kuz jmo jbbrtxuaf!"  
my_key = "github"
decoded = decrypt_message(secret, my_key)
print("Secret message:", secret)
print("Using key:", my_key) 
print("Decoded text:", decoded)