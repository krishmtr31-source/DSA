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

        // now check ans list is sorted or not ->
        boolean flag = true;
        for (int i = 0; i < ans.size() - 1; i++) {
            if (ans.get(i + 1) <= ans.get(i)) {
                flag = false;
            }
        }
        return flag;

    }

    // inorder bst is always sorted ->

    private void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }
}




// time complexity - 0(n)
// space compleaxity - 0(n) -> which is not good.
// class Solution {
//     ArrayList<Integer> ans = new ArrayList<>();

//     public boolean isValidBST(TreeNode root) {

//         inorder(root);

//         // now check ans list is sorted or not ->
//         boolean flag = true;
//         for (int i = 0; i < ans.size() - 1; i++) {
//             if (ans.get(i + 1) <= ans.get(i)) {
//                 flag = false;
//             }
//         }
//         return flag;

//     }

//     // inorder bst is always sorted ->

//     private void inorder(TreeNode root) {
//         if (root == null)
//             return;

//         inorder(root.left);
//         ans.add(root.val);
//         inorder(root.right);
//     }
// }