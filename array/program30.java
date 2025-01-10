// WAJP to remove the duplicate values from the array and store all unique elements in a new Array.

package array;

import java.util.Arrays;

public class program30 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 7, 5, 8, 6};
        int[] uniqueArray = removeDuplicates(arr);
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Array with Unique Elements: " + Arrays.toString(uniqueArray));
    }
    
    public static int[] removeDuplicates(int[] arr) {
        // Sort the array to bring duplicates together
        Arrays.sort(arr);
        
        // Use a temporary array to store unique elements
        int[] temp = new int[arr.length];
        int j = 0;
        
        // Add the first element to the temp array
        temp[j++] = arr[0];
        
        // Traverse the sorted array and add only unique elements to temp
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                temp[j++] = arr[i];
            }
        }
        
        // Create a new array with the size of unique elements
        return Arrays.copyOf(temp, j);
    }
}
    