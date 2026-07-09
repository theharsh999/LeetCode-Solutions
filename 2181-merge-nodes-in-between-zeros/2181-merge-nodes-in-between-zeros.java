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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode ans = new ListNode(-1);
        ListNode dummy = ans;
        while(temp != null){
            int sum = 0;
            while(temp.val != 0){
                sum += temp.val;
                temp = temp.next;
            }
            ListNode newNode = new ListNode(sum);
            dummy.next = newNode;
            dummy = dummy.next;
            temp = temp.next;
        }
        return ans.next;
    }
}