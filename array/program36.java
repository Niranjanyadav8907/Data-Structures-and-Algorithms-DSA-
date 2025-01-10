// WAJP to sort the array elements in descending orde


package array;

public class program36{
    // Method to sort the array in descending order using bubble sort
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Loop through the array
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place, so we can skip them
            for (int j = 0; j < n - 1 - i; j++) {
                // If the current element is less than the next element, swap them
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; // You can modify this array as needed

        // Sort the array in descending order
        bubbleSortDescending(arr);

        // Print the sorted array
        System.out.print("Sorted array in descending order: ");
        for (int num : arr) {
            System.out.print(num + " "); // Print each element in the sorted array
        }
    }
}
