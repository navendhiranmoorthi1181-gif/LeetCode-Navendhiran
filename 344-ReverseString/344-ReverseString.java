// Last updated: 8/11/2026, 2:19:09 PM
class Solution {
    public void reverseString(char[] s) {
         for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--){
         char temp = s[i];
           s[i] = s[j];
         s[j] = temp;
    }
    }
}