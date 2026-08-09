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

    public int[] helper(TreeNode root){
        if(root == null){
            return new int[]{0,0};
        }
        if(root.left == null && root.right == null){
            return new int[]{root.val,1};
        }
        int left[] = helper(root.left);
        int right[] = helper(root.right);

        int sum = root.val + left[0] + right[0];
        int count = 1 + left[1] + right[1];

        return new int[]{sum, count};
    }

    public void dfs(TreeNode root, int count[]){
        if(root == null){
            return;
        }
        int pair[] = helper(root);
        int avg = pair[0]/pair[1];
        if(avg == root.val){
            count[0]++;
        }
        dfs(root.left, count);
        dfs(root.right, count);
    }
}