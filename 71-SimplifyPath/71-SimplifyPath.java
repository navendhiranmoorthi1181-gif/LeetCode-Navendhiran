// Last updated: 8/11/2026, 2:22:12 PM
class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        String [] arr=path.split("/");

        for(String str:arr ){
            if(str.equals("") ||str.equals(".")){
            continue;
            }
            else if(str.equals("..")){
            if(!st.isEmpty())
               st.pop();
            }
           else{
           st.push(str);
           }
        }

        if(st.isEmpty())
        sb.append("/");
        for(String ele:st){
            sb.append("/");
            sb.append(ele);

        }
        return sb.toString();
    }
}