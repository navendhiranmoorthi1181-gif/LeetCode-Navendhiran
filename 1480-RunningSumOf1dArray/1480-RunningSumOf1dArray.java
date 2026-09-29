// Last updated: 9/29/2026, 2:43:34 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length,i;
         for(i=1;i<n;i++)
         nums[i]=nums[i]+nums[i-1];
         return nums;
    }
}