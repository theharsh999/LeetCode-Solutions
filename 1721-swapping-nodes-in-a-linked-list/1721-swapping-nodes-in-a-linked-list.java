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
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        ListNode firstNode = null;
        ListNode secondNode = null;
        temp = head;
        for(int i=1; i<=size; i++){
            if(i == k){
                firstNode = temp;
            }
            if(i == size+1-k){
                secondNode = temp;
            }
            temp = temp.next;
        }

        int tempVal = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = tempVal;

        return head;
    }
}