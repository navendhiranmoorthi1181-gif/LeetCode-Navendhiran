// Last updated: 9/29/2026, 2:41:25 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
         return Math.min(k, numOnes) - Math.max(0, k - numOnes - numZeros);
    }
}