// Last updated: 8/11/2026, 2:21:02 PM
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
}