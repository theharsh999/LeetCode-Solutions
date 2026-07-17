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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        size++;  // because i don't counted last node
        k = k % size;
        if(k == 0) return head;

        temp.next = head;
        int n = size - k;
        while(n-- > 0){
            head = head.next;
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}