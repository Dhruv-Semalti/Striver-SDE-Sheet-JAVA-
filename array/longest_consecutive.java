import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Use HashSet instead of HashMap (faster/cleaner since we don't need indices)
        Set<Integer> set = new HashSet<>();
        //hash set has no duplicates
        int len = nums.length;
        if (len == 0) return 0;
        
        // Add elements to Set
        for (int i=0;i<len;++i) {
            set.add(nums[i]);
        }

        int max = 0;

        // here we iterated over set such that there is less number of elements we have tor itreate over
        // less duplicates
        for (int key : set) {
            
            // Optimization: Check if 'key' is the START of a sequence
            // this wil take ur complexity to O(n)
            if (!set.contains(key - 1)) {
                
                int current = key;
                int count = 1;

                // Logic Fix: Check if 'current + 1' exists, not 'key + 1'
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                
                max = Math.max(count, max);
            }
        }
        return max;
    }
}