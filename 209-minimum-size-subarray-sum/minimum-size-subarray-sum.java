class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // dynamic window question -> 
        int low = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;

        for (int high = 0; high < nums.length; high++) {
            sum += nums[high];

            while (sum >= target) {
                int len = high - low + 1;
                ans = Math.min(ans, len);
                sum -= nums[low];
                low++;
            }
        }

        if (ans == Integer.MAX_VALUE) {
            return 0;
        }

        return ans;
    }
}
