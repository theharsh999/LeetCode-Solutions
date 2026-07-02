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

        int st = -1;
        int end = -1;
        temp = head;
        for(int i=1; i<=size; i++){
            if(i == k){
                st = temp.val;
            }else if(i == size+1-k){
                end = temp.val;
            }
            temp = temp.next;
        }

        if(st == -1 || end == -1) return head;

        int tempVal = st;
        st = end;
        end = tempVal;

        temp = head;
        for(int i=1; i<=size; i++){
            if(i == k){
                temp.val = st;
            }else if(i == size+1-k){
                temp.val = end;
            }
            temp = temp.next;
        }

        return head;
    }
}