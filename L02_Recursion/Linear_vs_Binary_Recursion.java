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
        return A[n - 1] + sumLinearRecursive(A, n - 1);
    }

    // Recursive function to calculate the sum of array A using binary recursion
    public static int sumBinaryRecursive(int[] A, int start, int end) {
        // Base case: if the start index is greater than or equal to the end index,
        // it means we have covered all elements, so return 0
        if (start >= end) {
            return 0;
        }
        // Another base case: if there is only one element between start and end,
        // return that element
        else if (start == end - 1) {
            return A[start];
        } else {
            // Calculate the mid-point of the current array segment
            int mid = (start + end) / 2;
            // Recursively sum the first half from start to mid, and the second half from
            // mid to end, and return the total sum of both halves
            return sumBinaryRecursive(A, start, mid) + sumBinaryRecursive(A, mid, end);
        }
    }
}