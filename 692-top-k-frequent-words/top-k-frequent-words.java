class Solution {
    class Pair {
        String first;
        int second;

        Pair(String f, int s) {
            first = f;
            second = s;
        }

    }

    public List<String> topKFrequent(String[] words, int k) {

        List<String> ans = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a.second != b.second) {
                        return Integer.compare(a.second, b.second);
                    } else
                        return b.first.compareTo(a.first);

                });

        for (String element : map.keySet()) {
            int frequency = map.get(element);

            Pair curr = new Pair(element, frequency);

            if (pq.size() < k) {
                pq.add(curr);
                continue;
            }
            else if (curr.second < pq.peek().second || (curr.second == pq.peek().second &&
                curr.first.compareTo(pq.peek().first) > 0)) {
                continue;
            } 
            else {
                pq.remove();
                pq.add(curr);
            }
        }

        for (int i = 0; i < k; i++) {
            ans.add(pq.remove().first);
        }

        Collections.reverse(ans);
        return ans;
    }
}