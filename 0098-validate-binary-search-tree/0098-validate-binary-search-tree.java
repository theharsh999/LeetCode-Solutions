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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> tree = new ArrayList<>();
        inorder(root, tree);
        for(int i=0; i<tree.size()-1; i++){
            if(tree.get(i) >= tree.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public void inorder(TreeNode root, ArrayList<Integer> tree){
        if(root == null){
            return;
        }
        inorder(root.left, tree);
        tree.add(root.val);
        inorder(root.right, tree);
    }
}