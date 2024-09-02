class Solution {
    public int findMinTime(int N, int x, int y) {
        int left = 0;
        int right = (int) 1e9;
        int answer = -1;
        N--;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (middle / x + middle / y >= N) {
                answer = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return Math.min(x, y) + answer;
    }
}