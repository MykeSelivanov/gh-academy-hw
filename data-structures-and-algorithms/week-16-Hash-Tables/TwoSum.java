class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Store num and its position in the nums array
        Map<Integer,Integer> seenNums = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;

            if(seenNums.containsKey(y)){
                // return idx of the satysfyin num that was seen before,
                // and i - current index of the other number
                return new int[]{seenNums.get(y),i};
            }
            seenNums.put(x, i);
        }
        return new int[]{};
    }
}