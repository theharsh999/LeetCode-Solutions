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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> vals = new ArrayList<>();
        inorder(root, vals);
        return createBST(vals, 0, vals.size()-1);
    }

    public void inorder(TreeNode root, ArrayList<Integer> vals){
        if(root == null){
            return;
        }
        inorder(root.left, vals);
        vals.add(root.val);
        inorder(root.right, vals);
    }

    public TreeNode createBST(ArrayList<Integer> vals, int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st+end)/2;
        TreeNode newNode = new TreeNode(vals.get(mid));
        newNode.left = createBST(vals, st, mid-1);
        newNode.right = createBST(vals, mid+1, end);
        return newNode;
    }
}