// Last updated: 9/29/2026, 2:39:55 PM

import java.util.Arrays;
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;
        long totalSum=0;

        for(int i=0;i<k;i++){
            long element=nums[n-1-i];
            long cm=Math.max(1L,(long)mul-i);
            totalSum = totalSum + element*cm;
        }
        return totalSum;
    }
}