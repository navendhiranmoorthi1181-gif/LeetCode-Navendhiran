// Last updated: 8/11/2026, 2:16:51 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();

        //for s string
        for (char c : arr) {

            if (c == '#') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(c);
            }
        }
        String x = String.valueOf(st);

        //for t string
        for (char ch : arr1) {
            if (ch == '#') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            } else {
                st1.push(ch);
            }
        }
        String y = String.valueOf(st1);

        if (x.equals(y))
            return true;
        return false;

    }
}