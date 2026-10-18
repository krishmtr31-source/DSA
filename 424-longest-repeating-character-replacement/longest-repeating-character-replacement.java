class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int ans = 0;
        int maxFreq = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            while ((high - low + 1) - maxFreq > k) {
                char ch1 = s.charAt(low);
                map.put(ch1, map.getOrDefault(ch1, 0) - 1);

                if (map.get(ch1) == 0) {
                    map.remove(ch1);
                }
                low++;
            }

            int len = high - low + 1;
            ans = Math.max(ans, len);
        }

        return ans;

    }
}