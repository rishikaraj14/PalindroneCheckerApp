import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue) data structure.
 *
 * At this stage, the application:
 * - Inserts characters into a deque
 * - Removes characters from front and rear
 * - Compares them directly
 * - Displays the result
 *
 * This approach eliminates the need for separate
 * reversal structures like Stack or Queue.
 *
 * @author Rishika Raj
 * @version 7.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     *
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Create a Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}