class Solution {
    public int[] sortedSquares(int[] nums) {

        // brute force sol ->
        // int n = nums.length;
        // int[] ans = new int[n];

        // for(int i = 0; i<n; i++ ){
        //     ans[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(ans);
        // return ans;
         
        int n  = nums.length;
        int index = n-1;
        int start = 0;
        int end = n - 1;

        int[] ans = new int[n];

        while (start <= end) {
            if (nums[end] * nums[end] > nums[start] * nums[start] ) {
                ans[index] = nums[end] * nums[end];
                end--;
                index--;
            }
            else{
                ans[index] = nums[start] * nums[start];
                start++;
                index--;
            }
            
        }

        return ans;

    }
}