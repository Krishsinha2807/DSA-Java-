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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*ListNode temp1=l1;
        ListNode temp2=l2;
        int count1=0;
        int count2=0;
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        while(temp1!=null){
            count1++;
            temp1=temp1.next;
        }
        int arr1[]=new int[count1];
        temp1=l1;
        int idx1=0;
        while(temp1!=null){
            arr1[idx1]=temp1.val;
            idx1++;
            temp1=temp1.next;
        }// for fisrt list
    while(temp2!=null){
        count2++;
        temp2=temp2.next;
    }    
     int arr2[]=new int[count2];
     temp2=l2;
     int idx2=0;
     while(temp2!=null){
        arr2[idx2]=temp2.val;
        idx2++;
        temp2=temp2.next;
     }//for second array
     for(int i=arr1.length-1;i>=0;i--){
        list1.add(arr1[i]);
     }
     for(int j=arr2.length-1;j>=0;j--){
        list2.add(arr2[j]);
     }
     ListNode dummy=new ListNode(0);
     ListNode temp=dummy;
     int i=0;int j=list1.size();
     int k=list2.size();
     ArrayList<Integer>list3=new ArrayList<>();
     int a=0;
     while(i<j && i<k){
         a=list1.get(i)+list2.get(i);
         list3.add(a);
         i++;
     }  int x=0;
     while(x<list3.size()){
        temp.next=new ListNode(list3.get(x));
        temp=temp.next;
        x++;
     }
     return dummy.next; */
      ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        return dummy.next;
    }
}