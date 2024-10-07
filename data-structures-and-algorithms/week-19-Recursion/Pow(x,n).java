class Solution {
    public double myPow(double x, int n) {
        long exponent = (long) n;

        // negative n
        if (exponent < 0) {
            exponent = -exponent;
            x = 1 / x;
        }
        return myPow_(x, exponent);
    }

    private double myPow_(double x, long exponent) {
        if (exponent == 0) return 1;

        // even n, x^n = (x^2)^(n/2)
        // odd n, x^n = (x^2)^(n/2) * x, for eg. x^7 = (x^2)^3 * x
        if (exponent % 2 == 0) {
            return myPow_(x * x, exponent / 2);
        } else {
            return myPow_(x * x, exponent / 2) * x;
        }
    }
}