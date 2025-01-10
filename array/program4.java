// WAJP to print sum and average of all the  elements of array

package array;

public class program4 {
    public static void main(String[] args) {
        // Example array of integers
        int[] arr = {10, 20, 30, 40, 50};  // You can modify this array as needed

        int sum = 0;  // Variable to store the sum of the elements
        int count = arr.length;  // Get the number of elements in the array

        // Loop through the array to calculate the sum
        for (int num : arr) {
            sum += num;  // Add each element to the sum
        }

        // Calculate the average
        double average = (double) sum / count;

        // Print the sum and average
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);
    }
}
