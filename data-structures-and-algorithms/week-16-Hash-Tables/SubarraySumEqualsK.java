class Solution {
    public int subarraySum(int[] nums, int k) {
        int currentPrefixSum = 0;
        int answer = 0;

        // Map<prefixSum, seenCount>
        // seenCount is how many times prefixSum has been seen previously
        Map<Integer, Integer> prefixSumSeenCount = new HashMap<>();

        // Empty prefix => (prefixSum = 0, seenCount = 1)
        prefixSumSeenCount.put(0,1);

        for (int i = 0; i < nums.length; i++) {
            currentPrefixSum += nums[i];

            answer += prefixSumSeenCount.getOrDefault(currentPrefixSum - k, 0);

            // After current prefix was processed, we should add 1 to its seenCount
            prefixSumSeenCount.put(
                    currentPrefixSum,
                    prefixSumSeenCount.getOrDefault(currentPrefixSum, 0) + 1
            );
        }
        return answer;
    }
}