class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        int[] merge = new int[m+n];

        // for nums 1->
        for(int i = 0; i<m; i++){
            merge[i] = nums1[i];
        }

        // for nums 2->
        for(int i = 0; i<n; i++){
            merge[i+m] = nums2[i];
        }

        Arrays.sort(merge);

        // after sorting the merge arrays
        // copting to the nums 1

        // ans should be return in the num1 
        for (int i = 0; i < m + n; i++) {
            nums1[i] = merge[i];
        }

    }

}