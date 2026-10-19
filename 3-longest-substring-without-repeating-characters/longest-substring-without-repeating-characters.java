class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int low = 0;
        int ans = 0;


        for(int high = 0; high < s.length(); high++){
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while(map.get(ch) > 1){
                char ch1 = s.charAt(low);
                map.put(ch1, map.getOrDefault(ch1, 0) - 1);

                if(map.get(ch) == 0){
                    map.remove(ch);
                }
                low++;

            }
            int len = high - low + 1;
            ans = Math.max(ans, len);
        }

        return ans;

    }
}
