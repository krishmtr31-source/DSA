class Solution {
    public int minPairSum(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0;
        int r = n-1;
        int max = 0;
       
        while(l<r){
          max = Math.max(max,nums[l]+nums[r]);
          l++;
          r--;
        }

        return max;

    }
}



/* 

Dry run ->
3,5,4,2,4,6
after sorting
2,3,4,4,5,6
max = max(0,8)
max = max(8,8);
max = max(8,8)
ans = 8

*/