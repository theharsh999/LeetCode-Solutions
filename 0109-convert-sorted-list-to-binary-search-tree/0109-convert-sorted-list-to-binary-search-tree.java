/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    ListNode head;
    public TreeNode sortedListToBST(ListNode head) {
        this.head = head;
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        return buildBST(n);
    }

    private TreeNode buildBST(int n) {
        if (n <= 0) {
            return null;
        }

        // Left subtree
        TreeNode left = buildBST(n / 2);

        // Current head becomes root
        TreeNode root = new TreeNode(head.val);
        head = head.next;

        // Right subtree
        root.left = left;
        root.right = buildBST(n - n / 2 - 1);

        return root;
    }
}