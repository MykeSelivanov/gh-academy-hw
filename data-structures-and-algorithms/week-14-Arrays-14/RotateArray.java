class Solution {
    public void rotate(int[] nums, int k) {

        // if rotate the same number as nums.length
        // it will result in the same array as from the start,
        // therefore find out the remainder of length from the k
        k %= nums.length;

        // reverse the whole array =>
        // [1, 2, 3, 4, 5, 6, 7] => [7, 6, 5, 4, 3, 2, 1]
        reverse(nums, 0, nums.length - 1);

        // reverse the first k elements of the array
        // if k = 3, [7, 6, 5, 4, 3, 2, 1] => [5, 6, 7, 4, 3, 2, 1]
        reverse(nums, 0, k - 1);

        // reverse the remaning part of the array
        // [5, 6, 7, 4, 3, 2, 1] => [5, 6, 7, 1, 2, 3, 4]
        reverse(nums, k, nums.length - 1);

    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}