// WAJP to insert an element at certain position of the array

package array;

import java.util.Arrays;

public class program11 {
    public static void main(String[] args) {
        // Example sorted array of integers
        int[] arr = {10, 20, 30, 40, 50};  // You can modify this array as needed
        
        // Array of missing elements to be inserted
        int[] newElements = {25, 35};  // Multiple missing elements to be inserted

        // Sort the new elements array if needed
        Arrays.sort(newElements);

        // Create a new array with space for all new elements
        int[] newArr = new int[arr.length + newElements.length];

        int arrIndex = 0, newElemIndex = 0, newArrIndex = 0;

        // Traverse through both arrays (original and new elements) and insert them in sorted order
        while (arrIndex < arr.length && newElemIndex < newElements.length) {
            if (arr[arrIndex] < newElements[newElemIndex]) {
                newArr[newArrIndex++] = arr[arrIndex++];  // Copy original array element
            } else {
                newArr[newArrIndex++] = newElements[newElemIndex++];  // Insert new element
            }
        }

        // Copy any remaining elements from the original array
        while (arrIndex < arr.length) {
            newArr[newArrIndex++] = arr[arrIndex++];
        }

        // Copy any remaining elements from the new elements array
        while (newElemIndex < newElements.length) {
            newArr[newArrIndex++] = newElements[newElemIndex++];
        }

        // Print the original and updated arrays
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array after inserting " + Arrays.toString(newElements) + ": " + Arrays.toString(newArr));
    }
}

