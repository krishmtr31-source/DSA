class Solution {
    public boolean validPalindrome(String s) {

        if (s == null || s.length() == 0) {
            return true;
        }

        int low = 0;
        int high = s.length() - 1;

        while (low <= high) {
            if (s.charAt(low) == s.charAt(high)) {
                low++;
                high--;
            } else if (s.charAt(low) != s.charAt(high)) {
                return isPallindrome(s, low + 1, high) || isPallindrome(s, low, high - 1);
            }
        }
        return true;
    }

    public boolean isPallindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;

        }
        return true;
    }
}