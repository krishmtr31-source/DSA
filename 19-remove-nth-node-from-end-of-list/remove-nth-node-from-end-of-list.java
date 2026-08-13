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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
       ListNode temp = head;

       while(temp != null){
         temp = temp.next;
         length++;
        }

        if(n == length){
            head = head.next;
            return head;
        }

         ListNode prevNode = head;
        for(int i = 1; i<length-n; i++){
            prevNode = prevNode.next;
        }

        ListNode currNode = prevNode.next;
        prevNode.next  = currNode.next;

        
        currNode.next = null;

       return  head;
       
    }
}