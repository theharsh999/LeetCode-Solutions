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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Deque<TreeNode> stk = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            TreeNode curr = new TreeNode(nums[i]);
            while (!stk.isEmpty() && nums[i] > stk.peek().val) {
                TreeNode popped = stk.pop();
                curr.left = popped;
            }
            if (!stk.isEmpty()) {
                stk.peek().right = curr;
            }
            stk.push(curr);
        }
        TreeNode bottom = new TreeNode();
        while(!stk.isEmpty()){
            bottom = stk.pop();
        }
        return bottom;
    }
}