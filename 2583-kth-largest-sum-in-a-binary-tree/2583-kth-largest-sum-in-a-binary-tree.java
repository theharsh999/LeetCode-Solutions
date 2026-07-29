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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null)
            return -1;
        ArrayList<Long> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        long sum = -1;

        while (!q.isEmpty()) {
            int size = q.size();
            sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode currNode = q.remove();
                sum += currNode.val;
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            ans.add(sum);
            level++;
        }
        if (ans.size() < k)
            return -1;
        Collections.sort(ans);
        return ans.get(ans.size() - k);
    }
}