class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> map.get(a) - map.get(b)
        );

        for(int num: map.keySet()){
            pq.add(num);

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] ans = new int[k];

        for(int i = 0; i<k; i++){
            ans[i] = pq.poll();
        }

        return ans;





    }
}

/*

     HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < k; i++) {
            int element = 0;
            int maxfreq = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxfreq) {
                    maxfreq = entry.getValue();
                    element = entry.getKey();
                }
            }
            ans.add(element);
            map.remove(element);
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;




 */