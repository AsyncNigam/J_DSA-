package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

public class q11_swapping_nodes_in_a_linkedlist {
    class Solution {
        public ListNode swapNodes(ListNode head, int k) {
            ListNode fast=head;
            for(int i=1;i<k;i++)fast=fast.next;
            ListNode initial=fast;
            ListNode slow=head;
            while(fast.next != null){
                fast=fast.next;
                slow=slow.next;
            }
            int temp=initial.val;
            initial.val=slow.val;
            slow.val=temp;
            return head;
        }
    }
}
