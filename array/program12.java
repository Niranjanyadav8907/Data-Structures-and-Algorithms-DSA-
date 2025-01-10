// WAJP to remove an element from the certain position of the array.


package array;

import java.util.Arrays;

public class program12 {
    public static void main(String[] args) {
        // Example array of integers
        int[] arr = {10, 20, 30, 40, 50};  // You can modify this array as needed
        int position = 2;  // The position (0-based index) of the element to be removed

        // Create a new array with one less space to accommodate the removal
        int[] newArr = new int[arr.length - 1];

        // Copy elements from the old array to the new array, skipping the element at the given position
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != position) {
                newArr[j++] = arr[i];  // Copy elements except the one at 'position'
            }
        }

        // Print the original and new arrays
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array after removing element at position " + position + ": " + Arrays.toString(newArr));
    }
}
