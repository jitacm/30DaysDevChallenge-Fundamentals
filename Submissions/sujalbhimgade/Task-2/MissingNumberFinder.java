public class MissingNumberFinder {
    public static int findMissingNumber(int[] arr) {
        int xorSum = 0;
        
        for (int i = 0; i <= arr.length; i++) {
            xorSum ^= i;
        }
        
        for (int num : arr) {
            xorSum ^= num;
        }
        
        return xorSum;
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing number: " + findMissingNumber(arr));
    }
}