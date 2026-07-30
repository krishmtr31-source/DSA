class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        
        int n = nums.length;
        int l = 0;
        int count = 0;

        if(k <= 1){
            return 0;
        }

        int prod = 1;
        for(int r = 0; r<n; r++){
            prod *= nums[r];
            
            // shrinking -->
            while(prod >= k){
                prod /= nums[l];
                l++;  
            }
            count += r-l+1;
        }
        return count;
    }
}

// brute force O(n^2)

/*
    if(k <= 1){
        return 0;
    }
   
        int n = nums.length;
        int count = 0;

        for(int i = 0; i<n; i++){
            int prod = 1;
            for(int j = i; j >= 0; j--){
                prod *= nums[j];
              if(prod<k){
                    count++;
                }   
                else{  // stop the j loop
                    break;
                }
            }    
           
        }
        return count; */