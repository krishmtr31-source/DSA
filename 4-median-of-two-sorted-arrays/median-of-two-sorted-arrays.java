class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

         int m = nums1.length;
        int n = nums2.length;
        int[] merge = new int[m+n];
        int k = 0;
        int i = 0;
        int j = 0;
         while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                merge[k] = nums1[i];
                i++;
                k++;
            }else{
                merge[k]=nums2[j];
                j++;
                k++;
            }
         }
         
            while(i<m){
                merge[k] = nums1[i];
                i++;
                k++;
            }

            while(j<n){
                merge[k] = nums2[j];
                j++;
                k++;
            }

            int start = 0;
        int end  = m+n-1;

        while(start < end){
            int mid = start + (end-start)/2;
            // odd
            if((m+n) % 2 == 1){
                return merge[mid];
            }else{
                return ((double) merge[mid] + merge[mid+1]) / 2;
            }
        }

        return merge[end];
         
         
    }
}




       // int m = nums1.length;
        // int n = nums2.length;
        
        // int[] merge = new int[m+n];

    
        // // copy nums1
        // for(int i = 0; i<m; i++){
        //     merge[i] = nums1[i];
        // }
        // // copy nums2
        // for(int i = 0; i<n; i++){
        //     merge[i+m] = nums2[i];
        // }

        // Arrays.sort(merge);

        // int start = 0;
        // int end  = m+n-1;

        // while(start < end){
        //     int mid = start + (end-start)/2;
        //     // odd
        //     if((m+n) % 2 == 1){
        //         return merge[mid];
        //     }else{
        //         return ((double) merge[mid] + merge[mid+1]) / 2;
        //     }
        // }

        // return merge[end];