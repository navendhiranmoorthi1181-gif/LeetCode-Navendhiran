// Last updated: 8/11/2026, 2:22:15 PM
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        
        int x = 1, y = 2;
        for(int i = 2; i < n; i ++) {
            int temp = x; x = y; y = temp + y;
        }
        return y;
    }
}