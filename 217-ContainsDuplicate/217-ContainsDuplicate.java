// Last updated: 8/11/2026, 2:20:16 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // for(int i=1;i<n;i++){
        //         if(nums[i]==nums[i-1])
        //             return true;    
        // }
        // return false;
        Set<Integer> s=new HashSet<>();
        for(int ele:nums){
            if(!s.add(ele))
            return true;
        }
        return false;
        
       
    }
}