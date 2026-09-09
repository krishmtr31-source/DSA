class Solution {
    public List<String> letterCasePermutation(String s) {
        ArrayList<String> ans = new ArrayList<>();
        String ip = s;
        String op = "";
        solve(op , ip , ans);
        return ans;
    }

    static void solve(String op, String ip, ArrayList<String> ans){
        if(ip.length() == 0){
            ans.add(op);
            return;
        }

        char ch = ip.charAt(0);

        char Lower = Character.toLowerCase(ch);
        char Upper = Character.toUpperCase(ch);

        solve(op+Lower,ip.substring(1,ip.length()),ans);
        if(Lower != Upper){
           solve(op+Upper,ip.substring(1,ip.length()),ans);
        }
        
        return;
    }
}