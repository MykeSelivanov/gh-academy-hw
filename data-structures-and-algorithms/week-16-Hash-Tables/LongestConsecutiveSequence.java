class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int longestStreak = 0;
        for (int n : set) {
            // you define if n is a beginnign of the interval
            // based on if the n-1 exists in the set
            if (!set.contains(n-1)){
                int streakStart = n;
                int streakEnd = n;

                // find the end of the streak
                while (set.contains(streakEnd + 1)) {
                    streakEnd++;
                }

                // Update the value of the longestStreak, comparing previous longestStreak with
                // the value of current longest streak, which is streakEnd - streakStart + 1
                longestStreak = Math.max(longestStreak, streakEnd - streakStart + 1);
            }
        }
        return longestStreak;
    }
}