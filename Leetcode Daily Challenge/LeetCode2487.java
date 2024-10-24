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
    public ListNode removeNodes(ListNode head) 
    {
        if(head==null)
            return null;
        ListNode res=removeNodes(head.next);
        if(res==null)
            res=head;
        else if(res.val<=head.val)
        {
            head.next=res;
            res=head;
        }
        return res;
    }
}