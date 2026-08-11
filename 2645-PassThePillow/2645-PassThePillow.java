// Last updated: 8/11/2026, 2:14:39 PM
class Solution {
    public int passThePillow(int n, int time) {
         int pillow = time / (n - 1);
        return pillow % 2 == 0 ? (time % (n - 1) + 1) : (n - time % (n - 1));
    }
}