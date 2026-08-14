class Solution {
    public int removeElement(int[] nums, int val) {

        int n = nums.length;
        int k = 0;

        for(int start = 0; start < n; start++) {
            if (nums[start] != val) {
                nums[k] = nums[start];
                k++;
            }
        }

        return k;
    }
}
