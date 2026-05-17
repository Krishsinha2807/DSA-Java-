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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();//odd
        ArrayList<Integer>list1=new ArrayList<>();//even
        int i=1;
        ListNode temp=head;
        while(temp!=null){
            if(i%2!=0) list.add(temp.val);
            else list1.add(temp.val);
            temp=temp.next;
            i++;
        }
        temp=head;
        for(int j=0;j<list.size();j++){
            temp.val=list.get(j);
            temp=temp.next;
        }
        for(int k=0;k<list1.size();k++){
            temp.val=list1.get(k);
            temp=temp.next;
        }

        return head;
    }
}