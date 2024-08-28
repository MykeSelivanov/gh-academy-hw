class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1;
        int right = x;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid > (long) x) {
                right = mid - 1;
            } else {
                answer = mid;
                left = mid + 1;
            }
        }
        return answer;
    }
}
