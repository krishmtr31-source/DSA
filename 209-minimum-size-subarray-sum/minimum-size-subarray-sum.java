class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        while(high < n){
            sum += nums[high];


            while(sum >= target){
                int len = high - low + 1;
                ans = Math.min(ans,len);
                sum -= nums[low];
                low++;
            }

            high++;
        }

         if(ans == Integer.MAX_VALUE ){
            return 0;
        }
        return ans;





       
    }
}


































