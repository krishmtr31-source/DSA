class Solution {
    public int[][] merge(int[][] nums) {
        List<int[]> ans = new ArrayList<>();  // List<int[]> → int[][]
        int n = nums.length;
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        int start1 = nums[0][0];
        int end1 = nums[0][1];
       
        for (int i = 1; i < n; i++) {
            int start2 = nums[i][0];
            int end2 = nums[i][1];

            if (end1 >= start2) { // merge
                start1 = start1;
                end1 = Math.max(end1, end2);
                continue;
            } else { // no overlap
                ans.add(new int[] { start1, end1 });
                start1 = start2;
                end1 = end2;
            }

        }
        ans.add(new int[] { start1, end1 });
        int [][] result = ans.toArray(new int[ans.size()][]);
        return result;
    }
}