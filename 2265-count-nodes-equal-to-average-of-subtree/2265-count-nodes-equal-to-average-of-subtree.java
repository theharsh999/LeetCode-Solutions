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
    public int averageOfSubtree(TreeNode root) {
        int count[] = new int[1];
        count[0] = 0;
        dfs(root, count);
        return count[0];
    }

    public int[] dfs(TreeNode root, int count[]){
        if(root == null){
            return new int[]{0,0};
        }
        int left[] = dfs(root.left, count);
        int right[] = dfs(root.right, count);

        int sum = root.val + left[0] + right[0];
        int freq = 1 + left[1] + right[1];

        int avg = sum/freq;
        if(avg == root.val){
            count[0]++;
        }
        return new int[]{sum,freq};
    }
}