// WAJP to check whether a given array is in sorted order or not.


package array;

public class program42 {
    // Method to check if the array is sorted
    public static boolean isSorted(int[] arr) {
        boolean ascending = true;  // Assume the array is sorted in ascending order
        boolean descending = true; // Assume the array is sorted in descending order

        // Check for ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false; // If an element is greater than the next one, it's not ascending
                break;
            }
        }

        // Check for descending order
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                descending = false; // If an element is smaller than the next one, it's not descending
                break;
            }
        }

        // Return true if it's either ascending or descending
        return ascending || descending;
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {5, 10, 15, 20, 25}; // You can modify this array as needed

        // Check if the array is sorted
        if (isSorted(arr)) {
            System.out.println("The array is in sorted order.");
        } else {
            System.out.println("The array is not in sorted order.");
        }
    }
}
