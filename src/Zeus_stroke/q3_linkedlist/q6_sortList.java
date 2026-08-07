package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

public class q6_sortList {
    class Solution {
        public ListNode sortList(ListNode head) {
            if(head==null || head.next==null)return head;
            ListNode slow=head;
            ListNode fast=head.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            ListNode head2=slow.next;
            slow.next=null;

            head=sortList(head);
            head2=sortList(head2);

            head=mergeList(head,head2);

            return head;

        }

        ListNode mergeList(ListNode head1, ListNode head2){
            ListNode i=head1;
            ListNode j=head2;
            ListNode head=new ListNode(-1);
            ListNode k=head;

            while(i!=null && j!=null){
                if(i.val<j.val){
                    k.next=i;
                    k=k.next;
                    i=i.next;
                }
                else{
                    k.next=j;
                    k=k.next;
                    j=j.next;
                }
            }
            if(i!=null){
                k.next=i;
            }
            if(j!=null){
                k.next=j;
            }
            return head.next;
        }
    }
}
