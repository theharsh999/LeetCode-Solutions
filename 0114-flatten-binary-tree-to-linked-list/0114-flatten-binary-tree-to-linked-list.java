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
    public void flatten(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);

        for(int i=1; i<arr.size(); i++){
            root.left = null;
            if(root.right != null){
                root.right.val = arr.get(i);
            }else{
                root.right = new TreeNode(arr.get(i));
            }
            root = root.right;
        }
        return;
    }

    public void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        arr.add(root.val);
        inorder(root.left, arr);
        inorder(root.right, arr);
    }
}