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
    ArrayList<Integer> ans = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {

        inorder(root);

        int[] result = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }

        // now check result array is sorted or not ->
        boolean flag = true;
        for(int i = 0; i<result.length-1; i++){
            if(result[i+1] <= result[i]){
                flag = false;
            }
        }
        return flag;

    
    }

    private void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }
}