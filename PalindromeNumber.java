public class PalindromeNumber {
    // Check if integer is palindrome without converting to string
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        long reversed = 0;
        while (x != 0) {
            int d = x % 10;
            reversed = reversed * 10 + d;
            x /= 10;
        }
        return reversed == original;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(-121)); // false
        System.out.println(isPalindrome(10)); // false
    }
}
