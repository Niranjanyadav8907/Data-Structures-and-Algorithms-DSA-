//public class RemoveDuplicatesFromSortedArray {

package array;

import java.util.Arrays;

public class program44 { 
    public static void main(String[] args) {
        // Original array with duplicates
        int[] arr = {4, 5, 6, 4, 7, 5, 8, 6};
        
        // Remove duplicates from the array
        int[] uniqueArray = removeDuplicatesFromSortedArray(arr);
        
        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        // Display the array with unique elements
        System.out.println("Array with Unique Elements: " + Arrays.toString(uniqueArray));
    }
    
    /**
     * Method to remove duplicates from a sorted array.
     * 
     * @param arr The input array, which can contain duplicates.
     * @return A new array containing only unique elements from the input array.
     */
    public static int[] removeDuplicatesFromSortedArray(int[] arr) {
        // Step 1: Sort the input array to group duplicate elements together.
        Arrays.sort(arr);
        
        // Step 2: Create a temporary array to store unique elements.
        int[] temp = new int[arr.length];
        int j = 0; // Index for the unique elements in the temp array.
        
        // Step 3: Add the first element of the sorted array to the temp array.
        temp[j++] = arr[0];
        
        // Step 4: Iterate through the sorted array and add unique elements to the temp array.
        for (int i = 1; i < arr.length; i++) {
            // Check if the current element is different from the previous element.
            if (arr[i] != arr[i - 1]) {
                temp[j++] = arr[i]; // Add the unique element to the temp array.
            }
        }
        
        // Step 5: Copy the unique elements into a new array of size `j` and return it.
        return Arrays.copyOf(temp, j);
    }
}



