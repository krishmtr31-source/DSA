class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int low = 0;
        int count = map.size();
        int start = 0;
        int ans = Integer.MAX_VALUE;

        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);

            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) - 1);
                if (map.get(ch) == 0) {
                    count--;
                }

            }

            // we can get a possible ans 
            // shrink the window 
            while (count == 0) {
                int len = high - low + 1;
                if (len < ans) {
                    ans = len;
                    start = low;
                }

                char left = s.charAt(low);
                if (map.containsKey(left)) {
                    map.put(left, map.getOrDefault(left, 0) + 1);
                    if (map.get(left) == 1) {
                        count++;
                    }
                }
                low++;
            }

        }
        if (ans == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + ans);

    }
}