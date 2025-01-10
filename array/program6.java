// For the given array of Strings, print and count all the Strings which has even number of characters.


package array;

public class program6 {
    public static void main(String[] args) {
        // Example array of strings
        String[] arr = {"Hello", "World", "Java", "Programming", "Even", "Odd"};  // You can modify this array as needed

        int count = 0;  // Variable to count strings with even length

        System.out.println("Strings with even number of characters:");

        // Loop through the array to check each string
        for (String str : arr) {
            // Check if the length of the string is even
            if (str.length() % 2 == 0) {
                System.out.println(str);  // Print the string
                count++;  // Increment the count
            }
        }

        // Print the total count of strings with even length
        System.out.println("Total strings with even number of characters: " + count);
    }
}

