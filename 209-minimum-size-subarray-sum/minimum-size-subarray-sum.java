class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // dynamic window question -> 
       int n = nums.length;
       int low = 0;
       int high = 0;
       int ans = Integer.MAX_VALUE;
       int sum = 0;


       while(high < n){
           sum = sum +  nums[high];

          while(sum >= target){
              int len = high - low + 1;
              ans = Math.min(ans,len);
              sum = sum - nums[low];
              low++;
            }
            high ++;
       }

       if(ans == Integer.MAX_VALUE){
        return 0;
       }

       return ans; 
    }
}
