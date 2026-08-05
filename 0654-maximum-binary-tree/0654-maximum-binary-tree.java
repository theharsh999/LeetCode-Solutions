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
        return maxBT(nums, 0, nums.length-1);
    }

    public TreeNode maxBT(int nums[], int st, int end){
        if(st > end){
            return null;
        }
        int max = -1;
        int idx = -1;
        for(int i=st; i<=end; i++){
            if(max < nums[i]){
                max = nums[i];
                idx = i;
            }
        }

        TreeNode root = new TreeNode(nums[idx]);
        root.left = maxBT(nums, st, idx-1);
        root.right = maxBT(nums, idx+1, end);

        return root;
    }
}