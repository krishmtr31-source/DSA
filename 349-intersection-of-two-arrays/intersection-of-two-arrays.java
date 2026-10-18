class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> map = new HashSet<>();
        Set<Integer> gap = new HashSet<>();
        int n = nums1.length + nums2.length;

        for (int num : nums1) {
            map.add(num);
        }
       
        for (int num : nums2) {
            if (map.contains(num)) {
                gap.add(num);
            }
        }

        int [] ans = new int[gap.size()];
        int i = 0;

        for(int key : gap){
            ans[i] = key;
            i++;
        }
        return ans;
    }
}