class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(int j=0; j<n; j++){
            if(nums[j]%2==0){
            int a = nums[i];
            nums[i] = nums[j];
            nums[j] = a;
            i++;
        }
    }
        return nums;
    }
}