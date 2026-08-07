package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

public class q5_maximum_twin_sum_of_linked_list {
    class Solution {
        public int pairSum(ListNode head) {
            ListNode slow=head;
            ListNode fast=head.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode head2=slow.next;
            slow.next=null;
            head2=reverse(head2);
            int sum=0;

            ListNode t1=head;
            ListNode t2=head2;

            while(t1!=null && t2!=null){
                sum=Math.max(sum,t1.val+t2.val);
                t1=t1.next;
                t2=t2.next;
            }
            return sum;


        }
        ListNode reverse(ListNode head){
            ListNode c=head;
            ListNode p=null;
            ListNode f=head;
            while(c!=null){
                f=c.next;
                c.next=p;
                p=c;
                c=f;
            }
            return p;
        }
    }
}
