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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs(root, "", ans);
        return ans;
    }

    public void dfs(TreeNode node, String path, List<String> ans) {
        if (node == null) {
            return;
        } else {
            if (node.left == null && node.right == null) {
                path = path + node.val;
                ans.add(path);
                return;
            }
            dfs(node.left, path + node.val + "->", ans);
            dfs(node.right, path + node.val + "->", ans);
        }
    }
}