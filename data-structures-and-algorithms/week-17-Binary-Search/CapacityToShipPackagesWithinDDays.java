class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        int answer = -1;

        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left <= right) {
            int middle = (left + right) / 2;
            int need = 1;
            int current = 0;
            for (int weight: weights) {
                if (current + weight > middle) {
                    need += 1;
                    current = weight;
                } else {
                    current += weight;
                }
            }
            if (need > days) {
                left = middle + 1;
            } else {
                answer = middle;
                right = middle - 1;
            }
        }
        return answer;
    }
}