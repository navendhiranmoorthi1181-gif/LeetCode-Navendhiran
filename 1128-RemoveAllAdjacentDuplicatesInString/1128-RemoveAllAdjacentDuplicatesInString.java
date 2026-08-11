// Last updated: 8/11/2026, 2:16:15 PM
class Solution {
    public String removeDuplicates(String s) {
        char [] arr=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(char c:arr){
            if(!st.isEmpty() && st.peek()==c){
            st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c: st){
            sb.append(c);

        }
        return sb.toString();

    }
}