package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

import java.util.HashSet;

public class q9_linkedlist_cycle_detection {

//    by Floyd's cycle finding algorithm
        public class Solution {
            public boolean hasCycle(ListNode head) {
                if(head==null || head.next==null)return false;
                ListNode slow=head;
                ListNode fast=head.next.next;

                while(fast!=null && fast.next!=null){
                    fast=fast.next.next;
                    slow=slow.next;
                    if(fast==slow)return true;
                }
                return false;

            }
        }

//        by hashSet method
public class Solution2 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(set.contains(temp))return true;
            set.add(temp);
            temp=temp.next;
        }
        return false;
    }
}
}
