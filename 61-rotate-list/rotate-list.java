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
        if(head==null)
        {
            return head;
        }  
        ArrayList<Integer>list=new ArrayList<>();
         ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.rotate(list,k);
        temp=head;
         for(int l=0;l<list.size();l++)
         {
            temp.val =list.get(l);
            temp=temp.next;
         } 
         return head;
    }
}