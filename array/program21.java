// For the given array of 0’s, 1’s and 2’s Sort the elements(Without Sorting). i/p: [0, 2, 0, 1, 2, 1, 0, 2]  o/p: [0, 0, 0, 1, 1, 2, 2, 2]

package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class program21 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 1, 2, 1, 0, 2, 76, 56, 67, 400, 70, 1000};
        int[] sortedArray = sortArray(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sortArray(int[] arr) {
        // Separate 0s, 1s, and 2s and store the rest in a list
        List<Integer> others = new ArrayList<>();
        int count0 = 0, count1 = 0, count2 = 0;

        for (int num : arr) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else if (num == 2) count2++;
            else others.add(num);
        }

        // Sort the remaining elements
        Collections.sort(others);

        // Create a result array
        int[] result = new int[arr.length];
        int index = 0;

        // Add 0s, 1s, and 2s
        while (count0-- > 0) result[index++] = 0;
        while (count1-- > 0) result[index++] = 1;
        while (count2-- > 0) result[index++] = 2;

        // Add the sorted "others" elements
        for (int num : others) result[index++] = num;

        return result;
    }
} 