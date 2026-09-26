/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans = null; // initialize globally 

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        count(root, p, q);
        return ans;
    }

    private  int count(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return 0;
        }

        int k1 = count(root.left, p, q);
        int k2 = count(root.right, p, q);

        int self = 0;
        if (root == p || root == q) {
            self = 1;
        }

        int total = k1 + k2 + self;

        if (total == 2 && ans == null) {
            ans = root;
        }

        return total;
    }
}