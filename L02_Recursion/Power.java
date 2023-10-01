package L02_Recursion;

/* 
 * -- Code 02 --
 * Q: Calculate x^n using both iteration and recursion (assume x>0 and n>=0)
 */

public class Power {
    public static void main(String[] args) {
        System.out.println("Recursive: " + powerRecursive(2, 3));
        System.out.println("Iterative: " + powerIterative(2, 3));
    }

    // Recursive function to calculate x^n
    public static int powerRecursive(int x, int n) {
        // Base case: When n is 0, the power is 1.
        if (n == 0) {
            return 1;
        }
        // Recursive case: Multiply x by the power of (x, n - 1).
        return x * powerRecursive(x, n - 1);
    }

    // Iterative function to calculate x^n
    public static int powerIterative(int x, int n) {
        // Initialize the result to 1 because the power of 0 is 1.
        int result = 1;
        
        // Loop from 1 to n and multiply the result by x.
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        
        // Return the final result, which is the power of x^n.
        return result;
    }
}
