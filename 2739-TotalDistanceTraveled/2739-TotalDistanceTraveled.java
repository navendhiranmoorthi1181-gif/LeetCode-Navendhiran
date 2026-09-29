// Last updated: 9/29/2026, 2:40:57 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if((mainTank-1)/4<additionalTank)
        {
            return (((mainTank-1)/4)+mainTank)*10;
        }
        return (additionalTank+mainTank)*10;
    }
}