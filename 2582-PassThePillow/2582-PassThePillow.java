// Last updated: 9/29/2026, 2:41:44 PM
class Solution {
    public int passThePillow(int n, int time) {
         int pillow = time / (n - 1);
        return pillow % 2 == 0 ? (time % (n - 1) + 1) : (n - time % (n - 1));
    }
}