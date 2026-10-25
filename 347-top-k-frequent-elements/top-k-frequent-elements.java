class Solution {
    class Pair {
        int first; // element store hoga 
        int second; // frequency store hogi

        Pair(int f, int s) {
            first = f;
            second = s;
        }

    }

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.second, b.second));

        for (int i : map.keySet()) {
            int element = i;
            int frequency = map.get(i);

            Pair curr = new Pair(element, frequency);
            if (pq.size() < k) {
                pq.add(curr);
                continue;
            } else if (curr.second < pq.peek().second) {
                continue;
            } else {
                pq.remove();
                pq.add(curr);
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().first;
        }
        return ans;

        /*
          HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b));
        
        for (int num : map.keySet()) {
            pq.add(num);
        
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        int[] ans = new int[k];
        
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        
        return ans;
        
         */

        // approach 2 -> // brute force 
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

    }
}
