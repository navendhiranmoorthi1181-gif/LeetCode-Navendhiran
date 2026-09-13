// Last updated: 9/13/2026, 9:01:15 AM
1class Solution {
2    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
3        int [][] temp= new int[n][n];
4
5        for(int i=0;i<n;i++){
6            int k=rowShift[i];
7
8        for(int j=0;j<n;j++){
9            int newcol=(j-k+n)%n;
10            temp[i][newcol]=grid[i][j];
11        }
12        }
13        int [][] result = new int[n][n];
14
15        for(int j=0;j<n;j++){
16            int k=colShift[j];
17
18            for(int i=0;i<n;i++){
19                int newrow = (i-k+n)%n;
20                result[newrow][j]=temp[i][j];
21            }
22        }
23        return result;
24    }
25}