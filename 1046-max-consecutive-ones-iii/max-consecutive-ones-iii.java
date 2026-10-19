class Solution {
    public int longestOnes(int[] nums, int k) {

        int low = 0;
        int ans = 0;
        int countZeroes = 0;

        for (int high = 0; high < nums.length; high++) {

            if (nums[high] == 0) {
                countZeroes++;
            }
             
            while (countZeroes > k) {
                if (nums[low] == 0) {
                    countZeroes--;
                }

                low++;

            }
            int len = high - low + 1;
            ans = Math.max(ans, len);
        }
        return ans;
    }
}

// Brute force 
/*      int maxans = 0;

       for(int l = 0; l<n; l++){
            int CountZero = 0;
           for(int r = l; r<n; r++){
               if(nums[r] == 0){                  
                CountZero++;
               } 
               if(CountZero > k){ 
                  break;
                }
              maxans = Math.max(maxans,r-l+1);  
            }
        }
      return maxans ; */