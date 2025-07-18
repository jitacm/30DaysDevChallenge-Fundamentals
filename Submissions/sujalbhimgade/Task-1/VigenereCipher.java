import java.util.Scanner;

public class VigenereCipher{

    public static String vigenereEncrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        int keyIndex = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                char keyChar = key.charAt(keyIndex % key.length());
                int shift = keyChar - 'a';
                
                char encrypted = (char) ((ch - base + shift + 26) % 26 + base);
                result.append(encrypted);
                keyIndex++;
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

   
    public static String vigenereDecrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        int keyIndex = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                char keyChar = key.charAt(keyIndex % key.length());
                int shift = keyChar - 'a';
                
                char decrypted = (char) ((ch - base - shift + 26) % 26 + base);
                result.append(decrypted);
                keyIndex++;
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Vigenère Cipher ===");
            System.out.println("1. Encrypt Message");
            System.out.println("2. Decrypt Message");
            System.out.println("3. Exit");
            System.out.print("Select option (1-3): ");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter 1, 2, or 3.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter message to encrypt: ");
                    String plaintext = scanner.nextLine();
                    System.out.print("Enter encryption key: ");
                    String encryptKey = scanner.nextLine();
                    System.out.println("Encrypted: " + vigenereEncrypt(plaintext, encryptKey));
                    break;

                case 2:
                    System.out.print("Enter message to decrypt: ");
                    String ciphertext = scanner.nextLine();
                    System.out.print("Enter decryption key: ");
                    String decryptKey = scanner.nextLine();
                    System.out.println("Decrypted: " + vigenereDecrypt(ciphertext, decryptKey));
                    break;

                case 3:
                    running = false;
                    System.out.println("Program exited. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-3.");
            }
        }
        scanner.close();
    }
}