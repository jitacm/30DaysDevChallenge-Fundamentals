import java.util.Scanner;

public class Main {

    public static String decrypt(String text, String key) {
        StringBuilder plain = new StringBuilder();
        key = key.toLowerCase();
        int j = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                int shift = key.charAt(j % key.length()) - 'a';
                int base  = Character.isUpperCase(ch) ? 'A' : 'a';
                int dec   = ((ch - base - shift + 26) % 26) + base;
                plain.append((char) dec);
                j++;
            } else {
                plain.append(ch);
            }
        }
        return plain.toString();
    }

    public static void main(String[] args) {

        String text = "cmejink bh abjxbr kuz jmo jbbrtxuaf!";

        Scanner in = new Scanner(System.in);
        System.out.println("Encrypted message: " + text);
        System.out.print("Enter the key: ");
        String key = in.nextLine();

        String result = decrypt(text, key);
        System.out.println("Decrypted message: " + result);

        in.close();
    }
}
