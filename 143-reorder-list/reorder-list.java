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
    public void reorderList(ListNode head) {
        Stack<ListNode>stack=new Stack<>();
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
        stack.push(temp);
        temp=temp.next;
        c++;
        }
        temp=head;
        for(int i=0;i<c/2;i++)
        {
            ListNode last=stack.pop();
            ListNode nextNode =temp.next;
            temp.next=last;
            last.next=nextNode;
            temp=nextNode;
        }
        temp.next=null;
    }
}