class Solution {
    public int maxProduct(int[] nums) {
        int i = 0;
        int bestending = nums[0];
        int minbestending = nums[0];
        int ans = nums[0];

        for (i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = nums[i] * bestending;
            int v3 = nums[i] * minbestending;

            minbestending = Math.min(v1, Math.min(v2,v3));
            bestending = Math.max(v1, Math.max(v2, v3));
            ans = Math.max(ans, Math.max(bestending, minbestending));
        }

        return ans;
    }
}