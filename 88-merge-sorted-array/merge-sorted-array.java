class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // brute force solutoion 
        // int[] merge = new int[m+n];

        // for(int i = 0; i<m; i++){
        //     merge[i] = nums1[i];
        // }
        // for(int i = 0; i<n; i++){
        //     merge[i+m] = nums2[i];
        // }
        // Arrays.sort(merge);

        // // after sorting the merge arrays
        // // copting to the nums 1
        // // ans should be return in the num1 
        // for (int i = 0; i < m + n; i++) {
        //     nums1[i] = merge[i];
        // }

        // optimal solotion

        int[] merge = new int[m + n];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merge[index] = nums1[i];
                i++;
                index++;
            } else {
                merge[index] = nums2[j];
                j++;
                index++;
            }
        }

        while (i < m) {
            merge[index] = nums1[i];
            i++;
            index++;
        }

        while (j < n) {
            merge[index] = nums2[j];
            j++;
            index++;
        }

        for (int k = 0; k < n + m; k++) {
            nums1[k] = merge[k];
        }
    }

}

/* 
  
  1 2 3 0 0 0 
  2 5 6
  
  1 2 2 3 5 








*/