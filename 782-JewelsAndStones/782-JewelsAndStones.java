// Last updated: 8/11/2026, 2:17:06 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            String ch = String.valueOf(stones.charAt(i));

            if (jewels.contains(ch)) {
                count++;
            }
        }

        return count;
    }
}