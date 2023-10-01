package L02_Recursion;

/* 
 * -- Code 04 --
 * -- The Fibonacci Numbers --
 * 
 * The Fibonacci Number 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, . . . . .
 * Each number after the second number is the sum of the two preceding numbers.
 * These numbers can naturally be defined recursively
 * 
 * Q: Calculate n-th element of Fibonacci sequence using Binary Recursion
 */

public class Fibonacci_Numbers {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    // Recursive function to calculate the n-th element of Fibonacci sequence
    public static int fibonacci(int n) {
        // Base case: When n is 1 or 2, the Fibonacci number is 1.
        if (n == 1 || n == 2) {
            return 1;
        }
        // Recursive case: Add the two preceding numbers to get the Fibonacci number.
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
