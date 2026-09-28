/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        ArrayList<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        ArrayList<Integer>path = new ArrayList<>();

        fun(root, 0, targetSum , path);
        return ans;

    }
     public void fun(TreeNode root , int sum , int targetSum,  ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.val);
        sum += root.val;
        if(root.left == null && root.right == null){
            if(sum == targetSum){
                ans.add(new ArrayList<>(path));
            }
        }
        fun(root.left , sum, targetSum,path);

        fun(root.right,sum, targetSum,path);

        path.remove(path.size()-1);


        return;

    }


}