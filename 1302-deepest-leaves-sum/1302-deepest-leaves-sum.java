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
    public int deepestLeavesSum(TreeNode root) {
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.add(root);
        int sum = 0;

        while(!dq.isEmpty()){
            int n = dq.size();
            sum = 0;

            while(n-- > 0){
                TreeNode node = dq.remove();
                sum += node.val;

                if(node.left != null) dq.add(node.left);
                if(node.right != null) dq.add(node.right);
            }
        }
        return sum;
    }
}