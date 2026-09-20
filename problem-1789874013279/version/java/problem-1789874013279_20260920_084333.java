// Last updated: 9/20/2026, 8:43:33 AM
1class Solution {
2    public long countIntersectingIntervals(int[][] intervals) {
3       int t[][]=intervals;
4        int n=intervals.length;
5
6        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
7        int [] ends=new int[n];
8
9        for(int i=0;i<n;i++){
10            ends[i]=intervals[i][1];
11        }
12
13        Arrays.sort(ends);
14
15        int[] bit=new int[n+1];
16        long ans=0;
17
18        for(int i=0;i<n;i++){
19            int start=intervals[i][0];
20
21            int pos=lowerBound(ends,start);
22
23            int notIntersecting=query(bit,pos);
24
25            ans+=(long)i-notIntersecting;
26
27            int index =lowerBound(ends,intervals[i][1]+1);
28            update(bit,index);
29        }
30        return ans;
31    }
32    private int lowerBound(int[] arr,int target){
33        int left=0;
34        int right=arr.length;
35
36        while(left<right){
37            int mid=left+(right-left)/2;
38            if(arr[mid]<target){
39                left=mid+1;
40            }
41            else{
42                right=mid;
43            }
44        }
45        return left;
46    }
47        private void update(int[] bit,int index){
48            while(index<bit.length){
49                bit[index]++;
50                index+=index & -index;
51            }
52        }
53        private int query(int[] bit,int index){
54            int sum=0;
55            while(index>0){
56                sum+=bit[index];
57                index -=index & -index;
58            }
59                    return sum;
60    }
61}