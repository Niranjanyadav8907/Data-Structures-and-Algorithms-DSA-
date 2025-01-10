// WAJP to print alternate element of the array from end.


package array;

public class program9 {
    public static void main(String[] args) {
        // Example array of integers
        int[] arr = {10, 20, 30, 40, 50, 60, 70};  // You can modify this array as needed

        System.out.println("Alternate elements from the end:");

        // Loop through the array starting from the last element
        for (int i = arr.length - 1; i >= 0; i -= 2) {
            
        /* Loop through the array starting from the first element (index 0)
        for (int i = 0; i < arr.length; i += 2) {  */

            System.out.println(arr[i]);  // Print the current element
        }
    }
}

