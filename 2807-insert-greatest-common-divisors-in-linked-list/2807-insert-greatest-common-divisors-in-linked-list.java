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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev = head;
        ListNode curr = prev.next;
        while(curr != null){
            int gcd = gcd(prev.val, curr.val);
            ListNode newNode = new ListNode(gcd);
            prev.next = newNode;
            newNode.next = curr;
            prev = newNode.next;
            curr = prev.next;
        }
        return head;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}