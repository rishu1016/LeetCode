class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return ans(nums,0,0, target);
    }
    private int ans(int[] nums, int index, int currSum, int target){
        if(index==nums.length){
            if(currSum==target){
                return 1;
            }else{
                return 0;
            }
        }
        int left = ans(nums, index+1, currSum + nums[index], target);
        int right = ans(nums, index+1, currSum-nums[index], target);
        return left+right;
    }
}