class Solution {
    public int firstMissingPositive(int[] nums){

        int n = nums.length;


        cyclic(nums);
        for(int  i = 0; i<n; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return n+1;

    }
        static void cyclic(int[] nums){
            int i = 0;
          while(i < nums.length) {
             int correctindex = nums[i] - 1;
             if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctindex]){
                  swap(nums, i, correctindex);
                }else {
                    i++;
                }  
            } 
        } 

    static void swap(int[] nums, int first , int end ){
        int temp = nums[first];
        nums[first] = nums[end];
        nums[end] = temp;
    }
}

 