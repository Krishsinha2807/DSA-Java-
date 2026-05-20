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
        ListNode temp=head;
        ListNode prev=null;
       // if(n==1) return head.next;
        if(head==null) return head;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        ListNode temp1=prev;
        int count=0;
        ListNode prev1=null;
        while(temp1!=null){
            count ++;
            if(count==n){
                if(prev1==null) prev=temp1.next;
                else prev1.next=prev1.next.next;
               break;
            }
            prev1=temp1;
            temp1=temp1.next;
        }
         temp = prev;
        prev = null;

        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;

    }
}