public class Main {
    public static void main(String[] args) {
        int x = 151; // The number to check if it's a palindrome
        int n = x;   // Copy the value of x into n
        
        // Negative numbers are not considered palindromes
        if (x < 0) {
            System.out.println("Not a palindrome number");
            return; // Exit the method, since it's not a palindrome
        }

        int revNum = 0; // To store the reversed number

        // Reverse the number
        while (n > 0) {
            int d = n % 10;    // Get the last digit
            revNum = revNum * 10 + d; // Build the reversed number
            n = n / 10;        // Remove the last digit
        }

        // Check if the reversed number is the same as the original
        if (revNum == x) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}
