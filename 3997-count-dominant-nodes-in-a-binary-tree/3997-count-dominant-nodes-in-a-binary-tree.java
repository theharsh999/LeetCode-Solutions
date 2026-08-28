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
    public int countDominantNodes(TreeNode root) {
        int count[] = { 0 };
        count(root, count);
        return count[0];
    }

    public int count(TreeNode root, int count[]) {
        if (root == null) {
            return 0;
        }
        int leftMax = count(root.left, count);
        int rightMax = count(root.right, count);

        int max = Math.max(root.val, Math.max(leftMax, rightMax));
        if (root.val == max)
            count[0]++;

        return max;
    }
}