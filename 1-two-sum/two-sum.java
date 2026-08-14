class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> f = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int complement = target - nums[i];
            if(f.containsKey(complement)){
                return new int[] {f.get(complement) , i};
            }
            f.put(nums[i], i);
        }
        return new int[]{-1,-1}; // no solution is not found 
        
    }
}