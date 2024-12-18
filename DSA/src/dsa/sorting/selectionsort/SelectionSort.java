package dsa.sorting.selectionsort;

import java.util.Arrays;

/*
 * Given array: { 64, 25, 12, 22, 11 }
 */

// First Pass:
// Find the minimum element in the entire array, which is 11.
// Swap 11 with the first element (64).
// Array after the first pass: { 11, 25, 12, 22, 64 }

/*
 * Second Pass:
 * Find the minimum element in the remaining unsorted part (25, 12, 22, 64), which is 12.
 * Swap 12 with 25.
 * Array after the second pass: { 11, 12, 25, 22, 64 }
 */

/*
 * Third Pass:
 * Find the minimum element in the remaining unsorted part (25, 22, 64), which is 22.
 * Swap 22 with 25.
 * Array after the third pass: { 11, 12, 22, 25, 64 }
 */

/*
 * Fourth Pass:
 * Find the minimum element in the remaining unsorted part (25, 64), which is 25.
 * No swap is needed since 25 is already in the correct position.
 * Array after the fourth pass: { 11, 12, 22, 25, 64 }
 */

/*
 * Fifth Pass:
 * Only one element remains (64), so no action is needed.
 * Final sorted array: { 11, 12, 22, 25, 64 }
 */

public class SelectionSort {
    public static void main(String[] args) {
        // Initializing the array to be sorted
        int values[] = { 64, 25, 12, 22, 11 };

        // Outer loop: Iterate through the array to find the minimum element in the unsorted part
        for (int i = 0; i < values.length - 1; i++) {

            // Set the current index as the minimum index
            int minIndex = i;

            // Inner loop: Compare each element with the current minimum element
            for (int j = i + 1; j < values.length; j++) {
                // If a smaller element is found, update the minimum index
                if (values[j] < values[minIndex]) {
                    minIndex = j;
                }
            }

            // If a smaller element was found and it's not in the correct position, swap the elements
            if (minIndex != i) {
            	// Swap using a temporary variable
                int temp = values[i]; 
                values[i] = values[minIndex]; 
                values[minIndex] = temp;
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(values));
    }
}