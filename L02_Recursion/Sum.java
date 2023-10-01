package L02_Recursion;

/* 
 * -- Code 03 --
 * -- Linear Recursion -- (In this case a recursive method makes at most one recursive call each time it is invoked)
 * Q: Calculate the sum of A, n time using linear recursion
 */

public class Sum {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        System.out.println("Recursive: " + sumRecursive(A, 5));
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
}