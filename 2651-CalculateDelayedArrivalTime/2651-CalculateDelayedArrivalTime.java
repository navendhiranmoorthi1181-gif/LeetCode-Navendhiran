// Last updated: 9/29/2026, 2:41:17 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return(arrivalTime+delayedTime)%24;
    }
} 