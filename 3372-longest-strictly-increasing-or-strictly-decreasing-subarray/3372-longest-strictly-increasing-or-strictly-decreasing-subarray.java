public class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int maxLen = 1; 
        int currentLen = 1; 
        boolean inc= false;
        boolean dec = false; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (dec) { 
                    currentLen = 1;
                    dec = false;
                }
                inc = true;
                currentLen++;
            } else if (nums[i] < nums[i - 1]) { 
                if (inc) { 
                    currentLen = 1;
                    inc = false;
                }
                dec = true;
                currentLen++;
            } else { 
                currentLen = 1;
                inc = false;
                dec = false;
            }
            maxLen = Math.max(maxLen, currentLen); 
        }
        return maxLen;
    }
}