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
    public ListNode deleteDuplicates(ListNode head) {
        //Stack<Integer>stack=new Stack<>();//
        ArrayList<Integer>list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            if(!list.contains(temp.val)) list.add(temp.val);
             temp=temp.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode tmp=dummy;
        int n=list.size();
        for(int i=0;i<n;i++){
           tmp.next=new ListNode(list.get(i));
           tmp=tmp.next;
        }
        return dummy.next;
        
    }
}