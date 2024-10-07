/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        boolean flag=false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                flag=true;
                break;
            }    
        }
        if(!flag)
            return null;
        slow=head;
        while(slow!=fast)
        {
            if(slow==fast)
                return slow;
            slow=slow.next;
            fast=fast.next;
        }
         if(slow==fast)
            return slow;
        return null;
    }
}
