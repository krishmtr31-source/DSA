class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans  =  new ArrayList<>();
        ArrayList<Integer> op = new ArrayList<>();
        ArrayList<Integer> ip = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
           ip.add(nums[i]);
        }
        solve(op,ip,ans);
        return ans;
    }

    static void solve( ArrayList<Integer> op, ArrayList<Integer> ip, List<List<Integer>> ans ){
        if(ip.size() == 0){
            ans.add(new ArrayList<>(op));
            return;
        }

        // include the first element 
        op.add(ip.get(0));
        solve(op,new ArrayList<>(ip.subList(1,ip.size())),ans);

        // backtrack

        op.remove(op.size()-1);
        solve(op,new ArrayList<>(ip.subList(1,ip.size())),ans);
    }
}