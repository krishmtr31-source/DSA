class Solution {
    public void reverseString(char[] s) {
        

        int n = s.length;
        int  l = 0;
        int r = n-1;

        while(l < r){
            swap( s, l, r);
            l++;
            r--;
        }
    }

    static void swap(char[] s, int first, int end){
        char temp = s[first];
        s[first] = s[end];
        s[end] = temp;
    }
}