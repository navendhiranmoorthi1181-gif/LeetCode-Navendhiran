// Last updated: 9/27/2026, 8:36:27 AM
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3        int[] sel=nums;
4        int base=0;
5        for(int i=0;i<nums.length-1;i++){
6            if(nums[i]==nums[i+1]){
7                base++;
8            }
9        }
10        Map<String,Integer>map=new HashMap<>();
11
12        for(int i=0;i<nums.length-1;i++){
13            int a=nums[i];
14            int b=nums[i+1];
15            if(a!=b){
16                int small=Math.min(a,b);
17                int large=Math.max(a,b);
18
19                String key=small+"#"+large;
20
21                map.put(key,map.getOrDefault(key,0)+1);
22            }
23        }
24        int bestGain=0;
25
26        for(int count:map.values()){
27            bestGain=Math.max(bestGain,count);
28        }
29        return base+bestGain;
30    }
31}