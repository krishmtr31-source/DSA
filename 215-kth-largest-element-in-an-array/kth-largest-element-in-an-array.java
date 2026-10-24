class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans = 0;

        for(int i = 0; i<k; i++){
            pq.add(nums[i]);
        }
        ans = pq.peek();

        for(int i = k; i<nums.length; i++){
            if(ans > nums[i]){
                continue;
            }
            else{
                pq.poll();
                pq.add(nums[i]);
                ans = pq.peek();
            }
        }
        return ans;

    }
}