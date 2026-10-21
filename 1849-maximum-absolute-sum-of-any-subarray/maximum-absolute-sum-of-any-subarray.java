class Solution {
    public int maxAbsoluteSum(int[] nums) {

         return Math.max(maxsum(nums), Math.abs(minsum(nums)));


        
    }

    private int maxsum(int[] nums){
        int bestending = nums[0];
        int ans = nums[0];

        for(int i = 1; i<nums.length; i++){
            int v1 = bestending + nums[i];
            int v2 = nums[i];

           bestending =  Math.max(v1,v2);

           ans = Math.max(ans, bestending);

        }
        return ans;
    }

    private int minsum(int[] nums){
        int minbestending = nums[0];
        int ans = nums[0];

        for(int i = 1; i<nums.length; i++){
            int v1 = minbestending + nums[i];
            int v2 = nums[i];

           minbestending =  Math.min(v1,v2);

           ans = Math.min(ans, minbestending);

        }
        return ans;
    }
}