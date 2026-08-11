// Last updated: 8/11/2026, 2:17:54 PM
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int start = 0, curr = 0;

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                sb.append(ch);
                start = curr + 1;
            } else {
                sb.insert(start, ch);
            }
            curr++;
        }

        return sb.toString();
    }
}