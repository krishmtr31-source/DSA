class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        // Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>(); 

        // for(int num : nums){
        //     set.add(num);
        // }

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                list.add(i);
            }
        }

        return list;
    }
    
}