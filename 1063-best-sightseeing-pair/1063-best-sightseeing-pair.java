class Solution {
    public int maxScoreSightseeingPair(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int val = nums[0];
        for(int i = 1; i<n; i++){
            ans = Math.max(ans,nums[i]+ val-1);
            val = Math.max(nums[i], val-1);
        }
        return ans;
    }
}