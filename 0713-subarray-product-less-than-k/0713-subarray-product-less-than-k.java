class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int prod = 1;
        int ans = 0;
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            prod *= nums[r];
            
            while (prod >= k && l <= r) {
                prod /= nums[l];
                l++;
            }
            ans += r - l + 1;
        }
        return ans;
    }
}
