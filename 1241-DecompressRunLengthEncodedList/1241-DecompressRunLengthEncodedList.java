// Last updated: 8/11/2026, 2:16:05 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        int size = 0;
        for (int i = 0; i < n; i += 2)
            size += nums[i];
        int[] arr = new int[size];
        int index = 0;
        for (int i = 0; i < n; i += 2) {
            Arrays.fill(arr, index, index + nums[i], nums[i + 1]);
            index += nums[i];
        }
        return arr;
    }
}