package dsa.sorting.bubblesort.simple;

import java.util.Arrays;

/*
Example of Bubble Sort:
Input Array: [5, 3, 8, 4, 2]

Pass 1:
- Compare 5 and 3 → Swap → [3, 5, 8, 4, 2]
- Compare 5 and 8 → No Swap → [3, 5, 8, 4, 2]
- Compare 8 and 4 → Swap → [3, 5, 4, 8, 2]
- Compare 8 and 2 → Swap → [3, 5, 4, 2, 8]
- Largest element (8) is now in its correct position.

Pass 2:
- Compare 3 and 5 → No Swap → [3, 5, 4, 2, 8]
- Compare 5 and 4 → Swap → [3, 4, 5, 2, 8]
- Compare 5 and 2 → Swap → [3, 4, 2, 5, 8]
- Second-largest element (5) is now in its correct position.

Pass 3:
- Compare 3 and 4 → No Swap → [3, 4, 2, 5, 8]
- Compare 4 and 2 → Swap → [3, 2, 4, 5, 8]
- Third-largest element (4) is now in its correct position.

Pass 4:
- Compare 3 and 2 → Swap → [2, 3, 4, 5, 8]
- All elements are now sorted.

Final Sorted Array: [2, 3, 4, 5, 8]

Key Notes:
- The largest unsorted element "bubbles" to its correct position in each pass.
- The number of comparisons decreases with each pass since the last elements are already sorted.
- The algorithm stops when no swaps are made during a pass (indicating the array is sorted).
*/

public class BubbleSortSimple {

	public static void main(String[] args) {
		// Initialize the array with unsorted values
		int values[] = { 5, 3, 8, 4, 2 };

		// Variable to count the number of iterations (comparisons)
		int iterationCount = 0;

		// Outer loop: Iterate through the entire array multiple times
		// Each pass "bubbles" the largest element to the correct position at the end
		for (int i = 0; i < values.length; i++) {

			// Inner loop: Compares adjacent elements and swaps them if necessary
			// It compares each pair of adjacent elements in the unsorted section
			for (int j = 0; j < values.length - 1; j++) {
				// If the current element is greater than the next one, swap them
				if (values[j] > values[j + 1]) {
					// Swap using a temporary variable
					int temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;
				}

				// Increment iteration count after each comparison
				iterationCount++;
			}

			// Print the array state after each pass of the outer loop (debugging purpose)
			System.out.println(Arrays.toString(values));
		}

		// Print the final sorted array after all passes
		System.out.println(Arrays.toString(values));

		// Print the total number of iterations (comparisons) made during sorting
		System.out.println("Iteration Count :: " + iterationCount);
	}
}
