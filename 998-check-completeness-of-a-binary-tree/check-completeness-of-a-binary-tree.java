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
    public boolean isCompleteTree(TreeNode root) {

        if (root == null)
            return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

          boolean found = false;

        while (q.size() != 0) {

            TreeNode t = q.peek();
            q.poll();

            if (t == null) {
                found = true;
            } else {
                if (found == true) {
                    return false;
                }
                q.add(t.left);
                q.add(t.right);
            }
        }
        return true;

    }

}