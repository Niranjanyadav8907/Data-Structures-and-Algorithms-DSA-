//WAJP to print each element of the array in reverse order.

package array;

public class program8 {
    public static void main(String[] args) {
        // Example array of integers
        int[] arr = {10, 20, 30, 40, 50};  // You can modify this array as needed

        System.out.println("Array elements in reverse order:");

        // Loop through the array from the last element to the first
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);  // Print each element
        }
    }
}
