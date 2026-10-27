class Solution {
    class Pair {
        int first;
        char second;

        Pair(int f, char s) {
            first = f;
            second = s;
        }
    }

    public String reorganizeString(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>( // max heap
                (a, b) -> {
                    if (a.first != b.first) {
                        return Integer.compare(b.first, a.first);
                    } else
                        return Character.compare(b.second, a.second);
                });

        for (char ch : map.keySet()) {
            pq.add(new Pair(map.get(ch), ch));
        }

        ArrayList<Character> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            Pair p1 = pq.poll();

            if (ans.size() == 0 || ans.get(ans.size() - 1) != p1.second) {
                ans.add(p1.second);
                p1.first--;

                if (p1.first > 0) { // wapas add krna pdega heap m bach gaya h
                    pq.add(p1);
                }

            } 
            else {
                if (pq.isEmpty()) {
                    return "";
                }

                Pair p2 = pq.poll();
                ans.add(p2.second);
                p2.first--;

                if (p2.first > 0) {
                    pq.add(p2);
                }

                pq.add(p1);
            }
        }
        StringBuilder sb = new StringBuilder();

        for (char ch : ans) {
            sb.append(ch);
        }

        String result = sb.toString();
        return result;

    }
}