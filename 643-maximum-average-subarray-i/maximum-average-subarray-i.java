class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = k - 1;
        int sum = 0;

        for (int i = low; i <= high; i++) {
            sum += nums[i];
        }

        int max = sum;

        // slide the window
        while (high < n) {
            sum = sum - nums[low];
            high++;
            if (high == n) {
                break;
            }
            sum = sum + nums[high];
            low++;

            max = Math.max(sum, max);
        }

        return (double) max / k;

    }
}

// you can do a for loop->
// for(int j = k; j<n; j++){
//           sum = sum - nums[j-k] + nums[j];

//         }