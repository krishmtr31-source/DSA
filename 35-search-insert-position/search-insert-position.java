class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target){
               return mid;
            }

            if (nums[mid] < target) {
                ans = mid;
                start = mid + 1;
               
            } else {
                end = mid - 1;
            }
        }
        return ans + 1;
    }
}