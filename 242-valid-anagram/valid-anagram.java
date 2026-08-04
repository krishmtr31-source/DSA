class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] arr = s.toCharArray();
        char[] brr = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);

        // Arrays.equals(arr1, arr2) boolean type
        // Remember these functions ->
        // s.toCharArray();   // Convert String -> char[]
        // s.charAt(i);       // Get character at index i
        // s.length();        // Length of string
        // s.substring(a, b); // Extract substring

        return Arrays.equals(arr,brr);  
    }
}