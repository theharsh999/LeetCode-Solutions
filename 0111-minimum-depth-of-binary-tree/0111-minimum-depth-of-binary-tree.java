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
    public int minDepth(TreeNode root) {
        return height(root);
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHt = height(root.left) + 1;
        int rightHt = height(root.right) + 1;

        if(root.left == null){
            return rightHt;
        }else if(root.right == null){
            return leftHt;
        }
        return Math.min(leftHt, rightHt);
    }
}