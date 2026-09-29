// Last updated: 9/29/2026, 2:39:21 PM
class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
       int t[][]=intervals;
        int n=intervals.length;

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int [] ends=new int[n];

        for(int i=0;i<n;i++){
            ends[i]=intervals[i][1];
        }

        Arrays.sort(ends);

        int[] bit=new int[n+1];
        long ans=0;

        for(int i=0;i<n;i++){
            int start=intervals[i][0];

            int pos=lowerBound(ends,start);

            int notIntersecting=query(bit,pos);

            ans+=(long)i-notIntersecting;

            int index =lowerBound(ends,intervals[i][1]+1);
            update(bit,index);
        }
        return ans;
    }
    private int lowerBound(int[] arr,int target){
        int left=0;
        int right=arr.length;

        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
        private void update(int[] bit,int index){
            while(index<bit.length){
                bit[index]++;
                index+=index & -index;
            }
        }
        private int query(int[] bit,int index){
            int sum=0;
            while(index>0){
                sum+=bit[index];
                index -=index & -index;
            }
                    return sum;
    }
}