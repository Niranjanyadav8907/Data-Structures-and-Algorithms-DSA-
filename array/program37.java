// WAJP to print first half of the array elements in ascending order and second half of the elements in descending orde


package array;

import java.util.Arrays;

public class program37 {
    // Method to sort the first half in ascending order and the second half in descending order
    public static void sortArrayHalves(int[] arr) {
        int n = arr.length; // Get the length of the array
        int mid = n / 2; // Calculate the mid-point

        // Sort the first half in ascending order
        Arrays.sort(arr, 0, mid); // Sort from index 0 to mid

        // Sort the second half in descending order using a custom comparator
        Arrays.sort(arr, mid, n); // Sort from mid to end
        reverse(arr, mid, n); // Reverse the sorted second half
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end - 1];
            arr[end - 1] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {25, 34, 12, 45, 23, 28}; // You can modify this array as needed

        // Sort the array halves
        sortArrayHalves(arr);

        // Print the resulting array
        System.out.print("Resulting array: ");
        for (int num : arr) {
            System.out.print(num + " "); // Print each element in the resulting array
        }
    }
}
