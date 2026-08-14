class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //brute force  through this cannot find the unique elements
        // List<List<Integer>> ans = new ArrayList<>();
        // int n = nums.length;

        // for (int i = 0; i < n -2 ; i++) {
        //     for (int j = i + 1; j < n -1 ; j++) {
        //         for (int k = j + 1; k < n; k++) {
        //             int sum = nums[i] + nums[j] + nums[k];
        //             if (sum == 0) {
        //                 ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
        //             } 
        //         }
        //     }
        // }
        // return ans;

        // optimal solution ->

        // solution video link https://www.youtube.com/watch?v=PShx8lzd8_E
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i<n-2; i++){
            if(i>0 && (nums[i] == nums[i-1])) continue;

            int j = i+1, k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j < k && nums[j] == nums[j+1]) j++;
                    while(j < k && nums[k] == nums[k-1]) k--;

                    j++;
                    k--;
                }
                else if(sum > 0){
                    k--;
                }
                else j++;
            }
        }
        return ans;
    }
}

