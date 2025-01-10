// WAJP to print the Biggest element, Smallest element and their difference in the array.


package array;

public class program5 {
    public static void main(String[] args) {
        // Example array of integers
        int[] arr = {10, 20, 5, 40, 15};  // You can modify this array as needed

        // Initialize variables for the biggest and smallest elements
        int biggest = arr[0];
        int smallest = arr[0];

        // Loop through the array to find the biggest and smallest elements
        for (int num : arr) {
            if (num > biggest) {
                biggest = num;  // Update biggest if current number is larger
            }
            if (num < smallest) {
                smallest = num;  // Update smallest if current number is smaller
            }
        }

        // Calculate the difference
        int difference = biggest - smallest;

        // Print the results
        System.out.println("Biggest element: " + biggest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Difference: " + difference);
    }
}
