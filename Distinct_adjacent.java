// Java program to check if we can rearrange array
// elements so that no two adjacent elements are the same

import java.util.HashMap;

public class GFG {

    // Function to check if adjacent elements can be made distinct
    static void distinctAdjacentElement(int a[], int n) {
        // HashMap to store frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element in the array
        for (int i = 0; i < n; ++i) {
            // If the element is already in the map, increment its count
            if (frequencyMap.containsKey(a[i])) {
                int updatedCount = frequencyMap.get(a[i]) + 1;
                frequencyMap.put(a[i], updatedCount);
            } else {
                // Otherwise, insert the element with count 1
                frequencyMap.put(a[i], 1);
            }
        }

        // Variable to store the maximum frequency of any element
        int maxFrequency = 0;

        // Loop through the array and update maxFrequency
        for (int i = 0; i < n; ++i) {
            int currentCount = frequencyMap.get(a[i]);
            if (maxFrequency < currentCount) {
                maxFrequency = currentCount;
            }
        }

        // Check if rearrangement is possible
        // The rule is: max frequency <= (n + 1) / 2
        if (maxFrequency > (n + 1) / 2) {
            System.out.println("NO"); // Not possible to rearrange
        } else {
            System.out.println("YES"); // Rearrangement possible
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        int a[] = { 7, 7, 7, 7 }; // Input array
        int n = a.length;        // Size of the array
        distinctAdjacentElement(a, n); // Call the function
    }
}
