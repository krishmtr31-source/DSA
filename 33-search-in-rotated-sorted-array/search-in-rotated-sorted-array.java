class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        // find the pivot 
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        int res = start; // pivot

        start = 0;
        end = n-1;
         
        // right half 
        if (target >= nums[res] && target <= nums[end]) {

            start = res;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }

        // right half

        else {
            end = res - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }

    }
}

/* 
 while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }

            // first half is sorted ->
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // 2nd half is sorted 
            else {
                if (nums[mid] < target && nums[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1; */