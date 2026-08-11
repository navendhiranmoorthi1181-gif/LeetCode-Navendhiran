// Last updated: 8/11/2026, 2:15:22 PM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=sandwiches.length-1;i>=0;i--)
        st.push(sandwiches[i]);

        for(int s : students){
        q.add(s);
        }
        int t=0;
        while(!q.isEmpty() && !st.isEmpty() && t<st.size()){
            if(q.peek()==st.peek()){
                q.poll();
                st.pop();
                t=0;
            }
            else{
                t++;
                q.add(q.poll());
            }
        }
        return q.size();
    }
}