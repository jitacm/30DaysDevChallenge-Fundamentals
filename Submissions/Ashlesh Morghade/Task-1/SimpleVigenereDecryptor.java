// SimpleVigenereDecryptor.java
public class SimpleVigenereDecryptor {

    public static void main(String[] args) {
        String encryptedMessage = "cmejink bh abjxbr kuz jmo jbbrtxuaf!";
        String customKey = "github"; // ye key hai, isse decrypt karna hai

        String decryptedResult = decryptVigenere(encryptedMessage, customKey);

        System.out.println("Original Encrypted: " + encryptedMessage);
        System.out.println("Key Used: " + customKey);
        System.out.println("Decrypted Message: " + decryptedResult); //here we can see
    }

    /**
     * Decrypts a Vigenere cipher message with a given key.
     * Keeps non-alphabetic characters as they are.
     *
     * @param message The encrypted string.
     * @param key The key string.
     * @return The decrypted string.
     */
    public static String decryptVigenere(String message, String key) {
        StringBuilder decrypted = new StringBuilder();
        String effectiveKey = key.toUpperCase(); // Key ko uppercase mein kare, so the calculation will be easy
        int keyLength = effectiveKey.length();
        int keyIndex = 0; // isse key ka track maintain karege

        for (char msgChar : message.toCharArray()) {
            if (Character.isLetter(msgChar)) {
                // Determine the 'base' for ASCII conversion (A for uppercase, a for lowercase)
                char base = Character.isUpperCase(msgChar) ? 'A' : 'a'; // now we'll check if its upper or lower case

                // Get the current key character, wrapping around if needed
                char currentKeyChar = effectiveKey.charAt(keyIndex % keyLength); 

                // Calculate the numeric value (0-25) of the message and key characters
                int msgVal = msgChar - base;
                int keyVal = currentKeyChar - 'A'; // Key character ka value (0-25).

                // Perform the decryption shift: (message_value - key_value + 26) % 26
                // Adding 26 handles cases where the subtraction results in a negative number
                int decryptedVal = (msgVal - keyVal + 26) % 26; 

                // Convert the numeric result back to a character and append
                decrypted.append((char) (base + decryptedVal));

                // Move to the next key character for the next alphabetical message character
                keyIndex++; // Agle character ke liye key mein aage badege.
            } else {
                // If it's not a letter, just append it as is
                decrypted.append(msgChar); // Space ya number hai toh change nahi karna hai
            }
        }
        return decrypted.toString();
    }
}