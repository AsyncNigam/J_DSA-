package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

public class q5_reverse_linkedlist {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode curr=head;
            ListNode prev=null;
            ListNode fut=head;
            while(curr!=null){
                fut=curr.next;
                curr.next=prev;
                prev=curr;
                curr=fut;
            }
            return prev;
        }
    }
}
