class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        Boolean odd = false;
        int sum = 0;
        for (char ch : map.keySet()) {
            int val = map.get(ch);
            if (val % 2 == 0) {
                sum += val;
            } else {
                odd = true;
                sum += val-1;
            }

        }
        if (odd) {
            return sum + 1;
        }

        return sum ;

    }
}