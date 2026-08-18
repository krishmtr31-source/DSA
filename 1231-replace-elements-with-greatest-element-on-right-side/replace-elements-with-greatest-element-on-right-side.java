class Solution {
    public int[] replaceElements(int[] nums) {
        int n = nums.length;
		int max = -1;
		ArrayList<Integer> res = new ArrayList<>();
		
		for (int i = n - 1; i >= 0; i--) {
			int current = nums[i];
			nums[i] = max;
			max = Math.max(current, max);
		}
		for (int i = 0; i<n; i++) {
			res.add(nums[i]) ;
		}
        int[] result = new int[n];
		for(int i = 0; i<n; i++){
            result[i] = res.get(i);
        }
        return result;
    }
}