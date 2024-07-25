public class Solution {
    // Method to compute the modified array after a sequence of updates
    public int[] getModifiedArray(int length, int[][] updates) {
        // Create an array 'differehce' initialized to zero, with the given length
        int[] difference = new int[length];

        // Apply each update in the updates array
        for (int[] update: updates) {
            int startIndex = update[0];
            int endIndex = update[1];
            int increment = update[2];

            // Apply increment to the start index
            difference[startIndex] += increment;

            // If the index is not the last element of the array
            // apply the negation of increment to the elemenent after the endIndex
            if (endIndex + 1 < length) {
                difference[endIndex + 1] -= increment;
            }
        }

        // Convert the 'difference' array into the actual array 'result'
        // where each element is the cumulative sum from start to that index
        for (int i = 1; i < length; i++) {
            difference[i] += difference[i-1];
        }

        // Return the resulted modified array
        return difference;
    }
}