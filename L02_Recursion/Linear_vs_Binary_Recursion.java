package L02_Recursion;

/* 
 * -- Code 03 --
 * -- Linear Recursion -- (In this case a recursive method makes at most one recursive call each time it is invoked)
 * -- Binary Recursion -- (In this case a recursive method makes two recursive call each time it is invoked)
 * 
 * Q: Given an array A of n integers, find the sum of its elements. (using linear_recursion and binary_recursion)
 */

public class Linear_vs_Binary_Recursion {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        System.out.println("Linear_Recursion: " + sumLinearRecursive(A, 5));
        System.out.println("Binary_Recursion: " + sumBinaryRecursive(A, 0, 5));
    }

    // Recursive function to calculate the sum of array A using lieaner_recursive
    public static int sumLinearRecursive(int[] A, int n) {
        // Base case: When n is 0, the sum is 0.
        if (n == 0) {
            return 0;
        }
        // Recursive case: Add the first element to the sum of the rest of the array.
        return A[0] + sumLinearRecursive(A, n - 1);
    }

    // Recusrive function to calculate the sum of array A using binary_recursive
    public static int sumBinaryRecursive(int[] A, int i, int n) {
        // Base case: When n is 0, the sum is 0.
        if (n == 0) {
            return 0;
        }
        // Recursive case: Add the first element to the sum of the rest of the array.
        return A[i] + sumBinaryRecursive(A, i + 1, n - 1);
    }
}