class Solution {
    public int findDuplicate(int[] arr) {
     
     // this question is solve through slow and fast pointer ->
    int slow = 0;
    int fast = 0;


        while(true){ // this is for cycle detection
            slow = arr[slow];
            fast = arr[fast];
            fast = arr[fast];

            if(slow == fast){
                break;
            }
        }

        slow = 0;

        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
       
}


  // in this question i modified the array --> .. sorting the array
    
          
     /*    cyclic(arr);
        int i = 0;
        while(i<arr.length){
            if(arr[i] != i+1){
                return arr[i];
            }
            else i++;
        }
        return 0; 
     
        static void cyclic(int[] arr){
            int i = 0;
            while( i<arr.length){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct] ){
                    swap(arr, i, correct);
                } else{
                    i++;
                }
            }
        }

        static void swap(int[] nums, int first, int end){
            int temp = nums[first];
            nums[first] = nums[end];
            nums[end] = temp; 
       }   */