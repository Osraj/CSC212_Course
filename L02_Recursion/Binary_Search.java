package L02_Recursion;

/* 
 * -- Code 05 --
 * -- Binary Search --
 * 
 *   − Binary Search Algorithm: o If the sequence is empty, return -1. o Let si be the middle element of the sequence. 
 *      ▪ If si = x, return its index i. 
 *      ▪ If si < x, apply the algorithm on the subsequence that lies above si.
 *      ▪ Otherwise, apply the algorithm on the subsequence of S that lies below si.
 * 
 * Q: Given S={s0, s1, … , sn-1} is a sorted sequence of n integers, and an integer x. Search whether x is in S.
 */

public class Binary_Search {
    public static void main(String[] args) {
        int[] S = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(binarySearch(S, 0, S.length - 1, 5));
    }

    // Recursive function to search whether x is in S.
    public static int binarySearch(int[] S, int low, int high, int x) {
        // Escape case: If the sequence is empty, return -1.
        if (low > high) {
            return -1;
        }

        // Update: Let si be the middle element of the sequence.
        int mid = (low + high) / 2;
        // Base case: If si = x, return its index i.
        if (S[mid] == x) {
            return mid;
        }

        // Recursive Part
        // If si < x, apply the algorithm on the subsequence that lies above si.
        if (S[mid] < x) {
            return binarySearch(S, mid + 1, high, x);
        }
        // Otherwise, apply the algorithm on the subsequence of S that lies below si.
        return binarySearch(S, low, mid - 1, x);
    }
}
