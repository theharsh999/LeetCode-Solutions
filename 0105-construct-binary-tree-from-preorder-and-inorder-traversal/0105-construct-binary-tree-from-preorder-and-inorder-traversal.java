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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int rootIdx[] = {0};
        return BST(preorder, rootIdx, inorder, 0, inorder.length-1);
    }

    public TreeNode BST(int preorder[], int rootIdx[], int[] inorder, int si, int ei){
        if(si > ei){
            return null;
        }
        int idx = -1;
        for(int i=si; i<=ei; i++){
            if(inorder[i] == preorder[rootIdx[0]]){
                idx = i;
            }
        }
        TreeNode root = new TreeNode(preorder[rootIdx[0]]);
        rootIdx[0]++;
        root.left = BST(preorder, rootIdx, inorder, si, idx-1);
        root.right = BST(preorder, rootIdx, inorder, idx+1, ei);

        return root;
    }
}