class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n + 1]; 
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; 

        for (int i = 1; i <= n; i++) {
            dp[i] = Math.min(dp[i], dp[i - 1] + costs[0]);
            int day7 = days[i - 1] - 7;
            int j = binarySearch(days, day7);
            dp[i] = Math.min(dp[i], dp[j + 1] + costs[1]);
            int day30 = days[i - 1] - 30;
            j = binarySearch(days, day30);
            dp[i] = Math.min(dp[i], dp[j + 1] + costs[2]);
        }

        return dp[n];
    }
    private int binarySearch(int[] days, int target) {
        int left = 0, right = days.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (days[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}