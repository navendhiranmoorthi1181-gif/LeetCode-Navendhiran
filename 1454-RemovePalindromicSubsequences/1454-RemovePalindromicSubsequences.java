// Last updated: 8/11/2026, 2:15:42 PM
class Solution {
    public int removePalindromeSub(String s) {

        if (new StringBuilder(s).reverse().toString().equals(s)) {
            return 1;
        }

        return 2;
    }
}