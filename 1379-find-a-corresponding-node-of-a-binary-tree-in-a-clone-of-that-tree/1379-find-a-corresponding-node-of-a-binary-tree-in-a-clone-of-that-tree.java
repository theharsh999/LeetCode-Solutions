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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return dfs(original, cloned, target);
    }

    private TreeNode dfs(TreeNode original, TreeNode ref, TreeNode target) {
        if (original == null)
            return null;
        if (original == target) {
            return ref;
        }
        TreeNode left = dfs(original.left, ref.left, target);
        TreeNode right = dfs(original.right, ref.right, target);
        
        if(left != null){
            return left;
        }
        return right;
    }
}