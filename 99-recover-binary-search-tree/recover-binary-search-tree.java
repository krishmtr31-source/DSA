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
    int galat = 0;
    TreeNode prev = null;
    TreeNode g1first;
    TreeNode g1second;
    TreeNode g2first;
    TreeNode g2second;

    public void recoverTree(TreeNode root) {

        inorder(root);
        if (galat == 1) {
            swap(g1first, g1second);
        } else {
            swap(g1first, g2second);
        }
        return;

    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        if (prev == null) {
            prev = root;
        } else {
            if (root.val <= prev.val) {
                if (galat == 0) {
                    g1first = prev;
                    g1second = root;
                    galat++;
                } else {
                    g2first = prev;
                    g2second = root;
                    galat++;
                }

            }
            prev = root;
        }
        inorder(root.right);

    }

    private void swap(TreeNode node1, TreeNode node2) {
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }
}