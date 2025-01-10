// WAJP to print first half of the array in ascending order and second half in descending order.


package array;

import java.util.Arrays;

public class program38 {
    // Method to sort the first half in ascending order and the second half in descending order
    public static void sortArrayHalves(int[] arr) {
        int n = arr.length; // Get the length of the array
        int mid = n / 2; // Calculate the mid-point

        // Sort the first half in ascending order
        Arrays.sort(arr, 0, mid); // Sort from index 0 to mid

        // Sort the second half in descending order
        int[] secondHalf = Arrays.copyOfRange(arr, mid, n); // Get the second half
        Arrays.sort(secondHalf); // Sort the second half in ascending order

        // Reverse the second half to get it in descending order
        for (int i = 0; i < secondHalf.length / 2; i++) {
            int temp = secondHalf[i];
            secondHalf[i] = secondHalf[secondHalf.length - 1 - i];
            secondHalf[secondHalf.length - 1 - i] = temp;
        }

        // Put the sorted second half back into the original array
        for (int i = mid; i < n; i++) {
            arr[i] = secondHalf[i - mid]; // Fill the original array with the sorted second half
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

