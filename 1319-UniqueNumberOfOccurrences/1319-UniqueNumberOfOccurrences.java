// Last updated: 8/11/2026, 2:16:01 PM
import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        // Count occurrences
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        // Check uniqueness
        Set<Integer> seen = new HashSet<>(freq.values());
        
        return seen.size() == freq.size();
    }
}
