package L02_Recursion;

/* 
 * Steps to solve problems using Recursive functions:
 *  1- write the base case (when the recursive function should stop recalling itself and traceback its steps) [for example: when you reach 1 in calculating factorial of n]
 *      note: it is possible to have more than one base case
 *  2- write the edge cases(special cases) [for example: when the array is empty]
 *  3- write the recursive case (it should have a part of the current call, and a part of the next call, so at the end they are combined to get the final result)
 */

public class Recursive_vs_Iterative {
    public static void main(String[] args) {
        System.out.println("Recursive: " + factorialRecursive(5));
        System.out.println("Iterative: " + factorialIterative(5));
    }

    // Recursive function to calculate the factorial of a number
    public static int factorialRecursive(int n) {
        // Base case: When n is 1, the factorial is 1.
        if (n == 1) {
            return 1;
        }
        // Recursive case: Multiply n by the factorial of (n - 1).
        return n * factorialRecursive(n - 1);
    }

    // Iterative function to calculate the factorial of a number
    public static int factorialIterative(int n) {
        // Initialize the result to 1 because the factorial of 0 and 1 is 1.
        int result = 1;
        
        // Loop from 1 to n and multiply the result by each number.
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        // Return the final result, which is the factorial of n.
        return result;
    }
}
