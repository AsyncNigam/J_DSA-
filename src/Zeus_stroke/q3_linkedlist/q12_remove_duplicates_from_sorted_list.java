package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

public class q12_remove_duplicates_from_sorted_list {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode temp=head;
            while(temp!=null && temp.next!=null){
                if(temp.val==temp.next.val)temp.next=temp.next.next;
                else temp=temp.next;
            }
            return head;
        }
    }
}
