package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

public class q7_add_two_numbers {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode t1=l1;
            ListNode t2=l2;
            ListNode head=new ListNode(-1);
            ListNode temp=head;
            int rem=0;
            while(t1!=null&& t2!=null){
                int sum=t1.val+t2.val+rem;
                ListNode n=new ListNode(sum%10);
                rem=sum/10;
                t1=t1.next;
                t2=t2.next;
                temp.next=n;
                temp=temp.next;
            }

            while(t1!=null){
                int sum=t1.val+rem;
                ListNode n=new ListNode(sum%10);
                rem=sum/10;
                temp.next=n;
                t1=t1.next;
                temp=temp.next;
            }
            while(t2!=null){
                int sum=t2.val+rem;
                ListNode n=new ListNode(sum%10);
                rem=sum/10;
                t2=t2.next;
                temp.next=n;
                temp=temp.next;
            }
            if(rem!=0){
                temp.next=new ListNode(rem);
                temp=temp.next;

            }
            temp.next=null;
            return head.next;
        }
    }}
