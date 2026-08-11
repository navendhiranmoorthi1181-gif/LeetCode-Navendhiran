// Last updated: 8/11/2026, 2:14:28 PM
class Solution {
    public int findTheLongestBalancedSubstring(String s) {

        int i = 0;
        int max = 0;

        while (i < s.length()) {

            int zeros = 0;
            int ones = 0;

            // Count consecutive 0s
            while (i < s.length() && s.charAt(i) == '0') {
                zeros++;
                i++;
            }

            // Count consecutive 1s
            while (i < s.length() && s.charAt(i) == '1') {
                ones++;
                i++;
            }

            max = Math.max(max, 2 * Math.min(zeros, ones));
        }

        return max;
    }
}