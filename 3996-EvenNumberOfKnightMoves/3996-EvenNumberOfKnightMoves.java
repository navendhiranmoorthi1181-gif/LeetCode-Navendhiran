// Last updated: 9/29/2026, 2:39:44 PM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        return((start[0]+start[1])%2)==((target[0]+target[1])%2);
    }
}