package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

public class q13_rotate_list {
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if(head==null || head.next==null)return head;
            int len=length(head);
            ListNode temp=head;
            k=k%len;
            if(k==0)return head;
            for(int i=1;i<len-k;i++){
                temp=temp.next;
            }
            ListNode newHead=temp.next;
            temp.next=null;
            ListNode t=newHead;
            while(t.next!=null){
                t=t.next;
            }
            t.next=head;
            return newHead;
        }
        int length(ListNode head){
            ListNode temp=head;
            int count=0;
            while(temp!=null){
                temp=temp.next;
                count++;
            }
            return count;
        }
    }
}
