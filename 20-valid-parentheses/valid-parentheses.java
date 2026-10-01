class Solution {
    public boolean isValid(String s) {

        int n = s.length();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            }
            if (st.size() == 0) {
                return false;
            }
            if (s.charAt(i) == ')' && st.peek() == '(' || s.charAt(i) == ']' && st.peek() == '[' || s.charAt(i) == '}' && st.peek() == '{') {
                st.pop();
            }
            else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') { // nums main character hai closing wale pr opening wale char nhi h stack mein
                return false;
            }
           
        }
        if (st.size() != 0) {
            return false;
        } else {
            return true;
        }

    }
}