// Last updated: 9/29/2026, 2:39:24 PM
class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        int[] sel=nums;
        int base=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                base++;
            }
        }
        Map<String,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length-1;i++){
            int a=nums[i];
            int b=nums[i+1];
            if(a!=b){
                int small=Math.min(a,b);
                int large=Math.max(a,b);

                String key=small+"#"+large;

                map.put(key,map.getOrDefault(key,0)+1);
            }
        }
        int bestGain=0;

        for(int count:map.values()){
            bestGain=Math.max(bestGain,count);
        }
        return base+bestGain;
    }
}