// Last updated: 8/11/2026, 2:17:15 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st= new Stack<>();
        int n=temperatures.length;
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                ans[st.peek()]=i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        return ans;

    }
}