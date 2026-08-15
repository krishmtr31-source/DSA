class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while (left <= right) {
            if (nums[left] + nums[right] <= limit) {
                left++;
            }
           
             right--;
             count++;

         
        }

        return count;
    }
}


