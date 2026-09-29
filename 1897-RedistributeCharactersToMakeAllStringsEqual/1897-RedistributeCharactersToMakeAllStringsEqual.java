// Last updated: 9/29/2026, 2:42:39 PM
class Solution {
    public boolean makeEqual(String[] words) {

        int[] freq = new int[26];

        // Count all characters
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }
        }

        // Check divisibility
        for (int count : freq) {
            if (count % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}