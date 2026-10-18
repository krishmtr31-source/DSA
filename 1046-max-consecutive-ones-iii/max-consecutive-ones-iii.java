class Solution {
    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int l = 0;
        int countZero = 0;
        int maxans = 0;

        for (int r = 0; r < n; r++) {

            if (nums[r] == 0) {
                countZero++;
            }

            while (countZero > k) {
                if (nums[l] == 0) {
                    countZero--;
                }
                l++;
            }

            maxans = Math.max(maxans, r - l + 1);
        }
        return maxans;
    }
}

// Brute force 
/*int maxans = 0;

      for(int l = 0; l<n; l++){
           int CountZero = 0;
          for(int r = l; r<n; r++){
              if(nums[r] == 0){
                  CountZero++;
              } if(CountZero > k){ 
                  break;
              }
              maxans = Math.max(maxans,r-l+1);  
          }
      }
      return maxans ; */