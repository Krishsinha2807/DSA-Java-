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
        ListNode temp=head;
        ArrayList<Integer>list=new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
     int dp[]=new int[list.size()];
     int idx=0;
     for(int i=0;i<list.size();i++){
        dp[idx]=list.get(i);
        idx++;
     } int count=0;
     ArrayList<Integer>list1=new ArrayList<>();
     for(int i=0;i<dp.length;i++){
        count =0;
        for(int j=0;j<dp.length;j++){
            if(dp[i]==dp[j]){
                count ++;
            }
        }
        if(count==1) list1.add(dp[i]);
     }
     ListNode dummy=new ListNode(0);
     ListNode temp1=dummy;
     int p=0;
     while(p<list1.size()){
        temp1.next=new ListNode(list1.get(p));
        temp1=temp1.next;
        p++;
     }
     return dummy.next;  
    }
}