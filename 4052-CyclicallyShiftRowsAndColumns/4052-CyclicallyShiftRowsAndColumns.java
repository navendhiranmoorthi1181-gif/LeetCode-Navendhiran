// Last updated: 9/29/2026, 2:39:26 PM
class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int [][] temp= new int[n][n];

        for(int i=0;i<n;i++){
            int k=rowShift[i];

        for(int j=0;j<n;j++){
            int newcol=(j-k+n)%n;
            temp[i][newcol]=grid[i][j];
        }
        }
        int [][] result = new int[n][n];

        for(int j=0;j<n;j++){
            int k=colShift[j];

            for(int i=0;i<n;i++){
                int newrow = (i-k+n)%n;
                result[newrow][j]=temp[i][j];
            }
        }
        return result;
    }
}