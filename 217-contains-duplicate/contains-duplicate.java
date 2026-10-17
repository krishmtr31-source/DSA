class Solution {
    public boolean containsDuplicate(int[] nums) {


        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return true;
            }

            set.add(num);
        }
        return false;

     
    }
}






// this is the map appraoch - > 


/*


        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i], 0) + 1);
        }

        for(int i = 0; i<nums.length; i++){
           if(map.get(nums[i]) != 1){
              return true;
            }
        }
        return false;





 */

// this question is also solve through hashset 

// t.c - nlogn
/*

       int n = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;



 */