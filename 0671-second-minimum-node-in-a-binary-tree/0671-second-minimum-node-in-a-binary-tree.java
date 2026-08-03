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
    public int findSecondMinimumValue(TreeNode root) {
        int min = root.val;
        dfs(root, min);
        if(ans == Long.MAX_VALUE) return -1;
        return (int)ans;
    }

    public long ans = Long.MAX_VALUE;

    public void dfs(TreeNode node, int min){
        if(node == null){
            return;
        }
        if(node.val > min){
            ans = Math.min(ans,node.val);
            return;
        }
        dfs(node.left, min);
        dfs(node.right, min);
    }
}