class Solution {
    public void sortColors(int[] nums) {
        int insertZeroPosition = 0;
        int insertTwoPosition = nums.length - 1;

        int i = 0;

        while (i <= insertTwoPosition) {
            if (nums[i] == 0){
                // if it's a 0, do a swap and put it at the beginging of the array
                swap(nums, insertZeroPosition, i);
                insertZeroPosition++;
                i++;
            } else if (nums[i] == 1) {
                // if it's 1, just leave it at it's position
                i++;
            } else { // if nums[i] == 2
                swap(nums, i, insertTwoPosition);
                insertTwoPosition--;
                // No need to do i++, because after swap nums[i] became 0,
                // another swap might be needed to put that 0 at the start of the array
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}