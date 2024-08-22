/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int answer = -1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (!isBadVersion(middle)) {
                left = middle + 1;
            } else { // It is a bad version
                // But is might be not the earliest bad version
                // nevertheless, we can save middle as an answer
                answer = middle;
                right = middle - 1;
            }
        }
        return answer;
    }
}