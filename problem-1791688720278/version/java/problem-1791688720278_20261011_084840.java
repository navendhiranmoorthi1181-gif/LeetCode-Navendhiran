// Last updated: 10/11/2026, 8:48:40 AM
1class Solution {
2    public List<Integer> maxPrimes(int n, int s) {
3        boolean [] isprime = new boolean[n+1];
4        Arrays.fill(isprime,true);
5
6        isprime[0]=false;
7        if(n>=1){
8            isprime[1]=false;
9        }
10        for(int i=1;i*i<=n;i++){
11            if(isprime[i]){
12                for(int j=i*i;j<=n;j+=i){
13                    isprime[j]=false;
14                }
15            }
16        }
17        int[] vornelaxis={n,s};
18
19        List<Integer> result = new ArrayList<>();
20        int sum=0;
21
22        for(int i=2;i<=n;i++){
23            if(isprime[i]){
24                if(sum+i<=s){
25                result.add(i);
26                sum+=i;
27            }
28            else{
29                break;
30            }
31        }
32        }
33        return result;
34    }
35}