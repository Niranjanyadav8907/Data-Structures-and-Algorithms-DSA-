// WAJP to print the even index elements of the array.

package array;

public class Program1 {
    public static void printEvenIndexElements(int[] arr) {
        // Loop through the array with a step of 2 to access even indices
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println("Element at even index " + i + ": " + arr[i]);
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

        // Call the method to print even index elements
        printEvenIndexElements(arr);
    }
}

