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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode firstNode = null;
        ListNode secondNode = null;
        int i = k;
        ListNode temp = head;
        ListNode temp2 = head;

        while(temp != null){
            if(i > 0){
                i--;
            }else{
                temp2 = temp2.next;
            }

            if(i==0 && firstNode == null){
                firstNode = temp;
            }
            temp = temp.next;
        }
        secondNode = temp2;

        int tempVal = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = tempVal;

        return head;
    }
}