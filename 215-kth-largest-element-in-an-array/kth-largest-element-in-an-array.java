class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans = 0;
           
        // tc of this code is nlogk
        for(int i = 0; i<k; i++){
            pq.add(nums[i]);
        }
        ans = pq.peek();
        int j = k;

        while(j < nums.length){
            if(ans > nums[j]){
                j++;
            }
            else{
                pq.poll();
                pq.add(nums[j]);
                ans = pq.peek();
                j++;
            }
        }
        return ans;

    }
}