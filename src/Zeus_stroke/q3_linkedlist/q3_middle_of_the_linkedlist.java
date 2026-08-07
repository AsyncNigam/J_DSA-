package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

public class q3_middle_of_the_linkedlist {

    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;

        }
    }
}
