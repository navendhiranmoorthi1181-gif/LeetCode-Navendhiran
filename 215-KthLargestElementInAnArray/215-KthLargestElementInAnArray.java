// Last updated: 8/11/2026, 2:20:19 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:nums){
            if(pq.size()<k){
                pq.add(x);
            }else if(x>pq.peek()){
                pq.poll();
                pq.add(x);

            }
        }
        
        return pq.peek();
    }
}