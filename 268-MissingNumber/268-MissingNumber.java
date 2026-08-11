// Last updated: 8/11/2026, 2:19:30 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,sum=0;
        for(int i=0;i<n;i++)
         sum+=nums[i];
            int x=n*(n+1)/2;
        return x-sum;
    }
}