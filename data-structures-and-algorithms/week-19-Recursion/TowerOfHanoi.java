public class Hanoi {
    private static class Solution {
        private void hanoi(int n, int from, int to) {
            if (n == 0) return;
            int auxilary = (1 + 2 + 3) - (from + to);
            hanoi(n-1, from, auxilary);
            System.out.println(n + " " + from + " " + to);
            hanoi(n - 1, auxilary, to);
        }
    }
}