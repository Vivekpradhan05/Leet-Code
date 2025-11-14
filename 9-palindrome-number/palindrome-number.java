class Solution {
    public static boolean isPalindrome(int x) {
        int rev = x;   // copy of x
        int reverse = 0;

        while (rev > 0) {
            int digit = rev % 10;
            reverse = reverse * 10 + digit;
            rev = rev / 10;
        }

        if (x == reverse) {
            System.out.println("The number is palindrome");
            return true;
        } else {
            System.out.println("The number is not palindrome");
            return false;
        }
    }

    public static void main(String args[]) {
        isPalindrome(121);
    }
}
