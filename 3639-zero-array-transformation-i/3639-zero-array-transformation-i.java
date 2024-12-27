class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] decrementsArray = new int[nums.length + 1];

        for(int i = 0; i < queries.length; i++){

            decrementsArray[ queries[ i ][ 0 ] ] += 1;
            decrementsArray[ queries[ i ][ 1 ] + 1 ] -= 1;
        }
        int currentSum = 0;
        for(int i = 0; i < nums.length; i++){

            currentSum += decrementsArray[ i ];

            if(nums[ i ] - currentSum > 0)
                return false;
        }
        return true;
    }
}