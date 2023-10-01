package L02_Recursion;

/* 
 * -- Code 03 --
 * Q: Calculate the sum of A, n time using both iteration and recursion
 */

public class Sum {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        System.out.println("Recursive: " + sumRecursive(A, 5));
        System.out.println("Iterative: " + sumIterative(A, 5));
    }

    // Recursive function to calculate the sum of A, n time
    public static int sumRecursive(int[] A, int n) {
        // Base case: When n is 0, the sum is 0.
        if (n == 0) {
            return 0;
        }
        // Recursive case: Add the first element to the sum of the rest of the array.
        return A[0] + sumRecursive(A, n - 1);
    }

    // Iterative function to calculate the sum of A, n time
    public static int sumIterative(int[] A, int n) {
        // Initialize the result to 0.
        int result = 0;

        // Loop from 0 to n - 1 and add each element to the result.
        for (int i = 0; i < n; i++) {
            result += A[i];
        }

        // Return the final result, which is the sum of A, n time.
        return result;
    }
}