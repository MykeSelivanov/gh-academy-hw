class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenPointer = 0;
        int oddPointer = 1;

        while (evenPointer < nums.length && oddPointer < nums.length) {
            // Find the next odd integer that is located at the even position
            while (evenPointer < nums.length && nums[evenPointer] % 2 == 0) {
                evenPointer += 2;
            }

            // Find the next even integer that is located at odd position
            while (oddPointer < nums.length && nums[oddPointer] % 2 == 1) {
                oddPointer += 2;
            }

            // When both are found, swap them
            if (evenPointer < nums.length && oddPointer < nums.length) {
                swap(nums, evenPointer, oddPointer);
            }
        }

        return nums;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}