class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = Firstoccurance(nums, target);
        int last = Lastoccurance(nums, target);

        return new int[] { first, last };

    }

    static int Firstoccurance(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    static int Lastoccurance(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }
}