package T00_Stack_and_Sorting;

public class Sort {
    // Problem 1: 
    // {(2,B), (4,D), (2,A), (1,E), (6,E), (4,B), (0,F)}

    // 1. Selection Sort (Unstable: doesn't maintaint the order of elements)
    // pointers
    // i =>  pointing at the elements one by one to be sorted
    // j => checking for the elements to swap with i // j always start from the element after i
    // min => points at the smallest elements
    // 1. find the smallest element in the array
    // 2. swap the smallest element with the first element
    // 3. repeat the process for the rest of the array
    // 4. repeat the process until the last element
    // 5. the array is sorted
    // each alteration will make the first element in that alteration "the smallest"



    // 2. Buble Sort (Stable: Maintain the order of elements)
    // the explaination of buble sort
    // 1. compare the first two elements
    // 2. if the first element is bigger than the second element, swap them
    // 3. compare the second and the third element
    // 4. if the second element is bigger than the third element, swap them
    // 5. repeat the process until the last element
    // 6. repeat the process until the last element - 1
    // 7. repeat the process until you reach the first elements
    // each altiration will make the last element in that alteration "the largest"


    // 3. Merge Sort
    // 1. divide the array into two halves
    // 2. sort the first half
    // 3. sort the second half
    // 4. merge the two halves
    // 5. repeat the process until the array is sorted



}
