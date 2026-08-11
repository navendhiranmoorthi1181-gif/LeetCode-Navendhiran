// Last updated: 8/11/2026, 2:22:51 PM
class Solution {
    public double myPow(double x, int n) {
        long exp = n;          // use long to handle -2^31
        if (exp < 0) {
            x = 1 / x;         // reciprocal for negative powers
            exp = -exp;
        }
        
        double result = 1.0;
        while (exp > 0) {
            if ((exp & 1) == 1) {   // if odd
                result *= x;
            }
            x *= x;                 // square the base
            exp >>= 1;              // divide exponent by 2
        }
        
        return result;
    }
}
