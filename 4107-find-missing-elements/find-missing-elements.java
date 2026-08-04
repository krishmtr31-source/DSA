class Solution {
    public List<Integer> findMissingElements(int[] nums) {
         
        int n = nums.length;
        List<Integer> miss = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0 ; i<n-1; i++){
            if(nums[i+1] - nums[i] != 1 ){
                for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                    miss.add(j);
                } 
            }
        }

        return miss;
         
    }
}