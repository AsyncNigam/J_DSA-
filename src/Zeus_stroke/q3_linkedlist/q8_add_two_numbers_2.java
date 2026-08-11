package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

public class q8_add_two_numbers_2 {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode t1=reverse(l1);
            ListNode t2=reverse(l2);
            ListNode dummy=new ListNode(-1);
            ListNode t=dummy;

            int sum=0;
            int carry=0;

            while(t1!=null && t2!=null){
                sum=t1.val+t2.val+carry;
                ListNode temp=new ListNode(sum%10);
                carry=sum/10;
                t.next=temp;
                t=t.next;
                t1=t1.next;
                t2=t2.next;
            }

            while(t1!=null){
                sum=t1.val+carry;
                ListNode temp=new ListNode(sum%10);
                carry=sum/10;
                t.next=temp;
                t=t.next;
                t1=t1.next;
            }

            while(t2!=null){
                sum=t2.val+carry;
                ListNode temp=new ListNode(sum%10);
                carry=sum/10;
                t.next=temp;
                t=t.next;
                t1=t1.next;
            }

            if(carry!=0){
                t.next=new ListNode(carry);
                t=t.next;
            }

            t.next=null;
            return reverse(dummy.next);
        }

        ListNode reverse(ListNode head){
            ListNode c=head;
            ListNode p=null;
            ListNode f=head;
            while(c!=null ){
                f=c.next;
                c.next=p;
                p=c;
                c=f;
            }
            return c;
        }
    }
}
