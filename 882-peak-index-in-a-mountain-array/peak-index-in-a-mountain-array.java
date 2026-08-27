class Solution {
    public int peakIndexInMountainArray(int[] nums) {
         int start = 0;
        int end = nums.length-1;
        int res  = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid + 1]){ 
                res = mid;// this ascending part of array
                end  = mid -1;   
            }
            else{
               // this descending  part og array 
               start = mid + 1;
            }
        }
        return res;

    }
}