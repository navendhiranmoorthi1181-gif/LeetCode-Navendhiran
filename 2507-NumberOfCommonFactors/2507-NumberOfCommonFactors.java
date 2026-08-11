// Last updated: 8/11/2026, 2:14:43 PM
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int n=Math.max(a,b);
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0) count++;
        }
        return count;
    }
}