// Last updated: 8/11/2026, 2:16:32 PM
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        char[] arr=s.toCharArray();
        for(char c:arr){
            if(c=='(')   st.push(c);
            else{
                if(st.isEmpty())  count++;
                else  st.pop();
            }
        }
        return count+st.size();
    }
}