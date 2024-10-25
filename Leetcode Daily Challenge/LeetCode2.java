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
        ListNode  dummy=new ListNode(0); 
        ListNode tail=dummy;
        int c=0;
        while(l1!=null || l2!=null || c!=0)
        {
            int n1=(l1!=null) ? l1.val : 0;
            int n2=(l2!=null) ? l2.val : 0;
            int sum=c+n1+n2;
            int x=sum%10;
            c=sum/10;
            ListNode newnode=new ListNode(x);
            tail.next=newnode;
            tail=tail.next;
            l1=(l1!=null) ? l1.next : null;
            l2=(l2!=null) ? l2.next : null;
        }
        ListNode res=dummy.next;
        dummy.next=null;
        return res;
    }
}
