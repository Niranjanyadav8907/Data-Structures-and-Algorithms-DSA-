// WAJP to print all the elements of array whose frequency are odd.


package array;

public class program27 {

    // Method to print elements that have odd frequency in the array
    public static void printOddFrequencyElements(int[] nums) {
        System.out.println("Elements with odd frequency:");

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            int count = 0; // Variable to count occurrences of nums[i]

            // Count the frequency of nums[i] in the array
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++; // Increment count if a match is found
                }
            }

            // If the frequency is odd and the element has not been printed yet
            if (count % 2 != 0) {
                // Print the element
                System.out.println(nums[i]);

                // To avoid printing the same element again, we can mark it as visited
                // Loop through the array to mark duplicates as visited
                for (int k = 0; k < nums.length; k++) {
                    if (nums[k] == nums[i]) {
                        nums[k] = Integer.MIN_VALUE; // Mark as visited (or any other marker)
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = {4, 5, 6, 4, 7, 5, 9,7}; // You can modify this array as needed

        // Call the method to print elements with odd frequency
        printOddFrequencyElements(nums); // This will display elements with odd frequency
    }
}

