package dsa.sorting.bubblesort.optimised;

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

public class BubbleSortOptimised {

	public static void main(String[] args) {
		// Initialize the array to be sorted
		int values[] = { 5, 3, 8, 4, 2 };

		// Variable to count the number of iterations (comparisons)
		int iterationCount = 0;

		// Outer loop: Iterates through the array, excluding the already sorted part at
		// the end
		for (int i = 0; i < values.length - 1; i++) {
			// Flag to check if any swap occurred in this pass
			boolean swapped = false;

			// Inner loop: Compares adjacent elements and performs swaps if necessary
			for (int j = 0; j < values.length - i - 1; j++) {
				// If the current element is greater than the next element, swap them
				if (values[j] > values[j + 1]) {
					// Swap the elements using a temporary variable
					int temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;

					// Set swapped to true, indicating a swap occurred
					swapped = true;
				}

				// Increment the iteration count after each comparison
				iterationCount++;
			}

			// If no swaps were made in this pass, the array is sorted, so break the loop
			if (!swapped) {
				break;
			}

			// Print the array after each pass (can be helpful for debugging)
			System.out.println(Arrays.toString(values));
		}

		// Print the final sorted array after all passes
		System.out.println(Arrays.toString(values));

		// Print the total number of iterations (comparisons) made
		System.out.println("Iteration Count :: " + iterationCount);
	}
}