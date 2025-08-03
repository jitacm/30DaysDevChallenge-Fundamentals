public class Main {

    // This function finds the missing number using XOR logic
    public static int findMissing(int[] nums) {
        int n = nums.length;
        int xorFull = 0;
        int xorArray = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xorFull ^= i;
        }

        // XOR all elements in the array
        for (int num : nums) {
            xorArray ^= num;
        }

        // The missing number is the one not canceled out
        return xorFull ^ xorArray;
    }

    public static void main(String[] args) {
        int[] numbers = {9, 6, 4, 2, 3, 5, 7, 0, 1};  // Missing number is 8

        int missing = findMissing(numbers);
        System.out.println("Missing number is: " + missing);
    }
}
