class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        int open = n;
        int close = n;
        String op = "";
        solve(op, open, close, ans);
        return ans;
    }

    static void solve(String op, int open, int close, ArrayList<String> ans) {
        if (close == 0 && open == 0) {
            ans.add(op);
            return;
        }
        if (open == close) {
            solve(op + "(", open - 1, close, ans);
        } else {
            if (open > 0) {
                solve(op + "(", open - 1, close, ans);
            }
            if (close > open) {
                solve(op + ")", open, close - 1, ans);
            }
        }
    }
}