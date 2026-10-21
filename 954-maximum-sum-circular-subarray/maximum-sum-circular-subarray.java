class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;
        Boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            total = nums[i] + total;

        }
        
        if(maxsum(nums) < 0){
            return maxsum(nums);
        }

        return Math.max(maxsum(nums), total - minsum(nums));

    }

    private int maxsum(int[] nums) {
        int bestending = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = bestending + nums[i];
            int v2 = nums[i];

            bestending = Math.max(v1, v2);

            ans = Math.max(ans, bestending);

        }
        return ans;
    }

    private int minsum(int[] nums) {
        int minbestending = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = minbestending + nums[i];
            int v2 = nums[i];

            minbestending = Math.min(v1, v2);

            ans = Math.min(ans, minbestending);

        }
        return ans;
    }
}