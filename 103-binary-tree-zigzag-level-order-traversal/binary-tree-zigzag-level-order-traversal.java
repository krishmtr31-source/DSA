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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        ArrayList<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int levelcount = 0;
        boolean flag = true;

        while (!q.isEmpty()) {
            int lvlsize = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            while (lvlsize != 0) {
                TreeNode t = q.peek();
                q.poll();
                temp.add(t.val);
                    if (t.left != null) {
                        q.add(t.left);
                    }
                    if (t.right != null) {
                        q.add(t.right);
                    }

                lvlsize--;
            }
            levelcount++;
            if(!flag){
                Collections.reverse(temp);
                ans.add(temp);
                flag = true;
            }else{
            ans.add(temp);
            flag=false;
            }

        }
        return ans;

    }
}