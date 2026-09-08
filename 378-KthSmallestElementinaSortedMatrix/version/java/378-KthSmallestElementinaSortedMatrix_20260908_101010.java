// Last updated: 9/8/2026, 10:10:10 AM
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        int totalCount = 0;
4        int sum = 0;
5        int prefixSum[] = new int[nums.length + 1];
6        prefixSum[0] = 1;
7        
8        for (int num : nums) {
9            sum += num;
10            if (sum >= goal) {
11                totalCount += prefixSum[sum - goal];
12            }
13            prefixSum[sum]++;
14        }
15        
16        return totalCount;
17    }
18}