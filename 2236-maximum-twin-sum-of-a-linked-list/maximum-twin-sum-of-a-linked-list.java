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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        int arr[]=new int[c];
        temp=head;
        int idx=0;
        while(temp!=null){
            arr[idx]=temp.val;
            idx++;
            temp=temp.next;
        }
       int i=0;
       int j=arr.length-1;
       int max=0;
       int fs=0;
       while(i<j){
          fs=arr[i]+arr[j];
          max=Math.max(max,fs);
          i++;
          j--;
       }
       return max;

        
    }
}