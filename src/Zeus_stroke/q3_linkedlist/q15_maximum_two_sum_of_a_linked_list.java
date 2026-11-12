package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

public class q15_maximum_two_sum_of_a_linked_list {
    class Solution {
        public int pairSum(ListNode head) {
            if(head==null || head.next==null)return head.val;
            if(head.next.next==null)return head.val+head.next.val;
            ListNode slow=head;
            ListNode fast=head.next.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

            }
            ListNode head2=slow.next;
            slow.next=null;

            head2=reverse(head2);
            int max=head.val+head2.val;

            ListNode t=head;
            ListNode t2=head2;

            while(t!=null || t2!=null){
                if((t.val+t2.val)>max)max=t.val+t2.val;
                t=t.next;
                t2=t2.next;
            }
            return max;
        }

        ListNode reverse(ListNode head){
            ListNode current=head;
            ListNode forward=head;
            ListNode prev=null;
            while(current!=null){
                forward=current.next;
                current.next=prev;
                prev=current;
                current=forward;
            }
            return prev;
        }
    }
}
