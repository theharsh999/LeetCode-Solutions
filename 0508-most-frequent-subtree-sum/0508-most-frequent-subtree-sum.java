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
    HashMap<Integer, Integer> map = new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {
        calculateSum(root);
        ArrayList<Integer> ans = new ArrayList<>();
        int maxFreq = 0;

        // calculating max freq
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        // adding max freq sums in AL
        for (int key : map.keySet()) {
            if (map.get(key) == maxFreq) {
                ans.add(key);
            }
        }

        // AL to arr conversion
        int res[] = new int[ans.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

    // calculate sum of node with subtree and add in map
    public int calculateSum(TreeNode root) {
        if (root == null)
            return 0;

        int leftSum = calculateSum(root.left);
        int rightSum = calculateSum(root.right);

        int sum = root.val + leftSum + rightSum;

        map.put(sum, map.getOrDefault(sum, 0) + 1);

        return sum;
    }
}