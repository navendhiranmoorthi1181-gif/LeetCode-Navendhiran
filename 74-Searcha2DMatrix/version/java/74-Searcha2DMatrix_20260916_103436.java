// Last updated: 9/16/2026, 10:34:36 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int low = 0;
7        int high = m - 1;
8
9        while (low <= high) {
10            int medium = low + (high - low) / 2;
11
12            if (target < matrix[medium][0]) {
13                high = medium - 1;
14            } else if (target > matrix[medium][n - 1]) {
15                low = medium + 1;
16            } else {
17                // target is in this row's range — reset left/right for this row
18                int left = 0, right = n - 1;
19                while (left <= right) {
20                    int mid = left + (right - left) / 2;
21                    if (target == matrix[medium][mid])
22                        return true;
23                    else if (target < matrix[medium][mid])
24                        right = mid - 1;
25                    else
26                        left = mid + 1;
27                }
28                return false; // row was right, value isn't in it
29            }
30        }
31        return false;
32    }
33}