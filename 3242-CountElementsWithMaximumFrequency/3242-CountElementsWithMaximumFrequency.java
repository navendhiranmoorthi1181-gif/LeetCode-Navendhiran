// Last updated: 8/11/2026, 2:13:58 PM
import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        // Count occurrences
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        // Find maximum frequency
        int maxFreq = 0;
        for (int count : freq.values()) {
            maxFreq = Math.max(maxFreq, count);
        }
        
        // Sum frequencies equal to maxFreq
        int total = 0;
        for (int count : freq.values()) {
            if (count == maxFreq) total += count;
        }
        
        return total;
    }
}
