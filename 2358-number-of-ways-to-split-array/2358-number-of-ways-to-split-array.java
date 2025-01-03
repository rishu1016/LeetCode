class Solution {
    public int waysToSplitArray(int[] nums) {
        long tot = 0, left = 0;
        int ans = 0;
        
        for (int num : nums) {
            tot += num;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            if (left >= tot - left) {
                ans++;
            }
        }
        return ans;
    }
}