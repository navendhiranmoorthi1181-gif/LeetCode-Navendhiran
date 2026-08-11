// Last updated: 8/11/2026, 2:21:35 PM
import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        // Add all numbers to set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                // Expand the sequence
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}