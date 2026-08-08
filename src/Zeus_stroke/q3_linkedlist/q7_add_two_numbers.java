package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

public class q7_add_two_numbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode t1=l1;
            ListNode t2=l2;
            ListNode head=new ListNode(-1);
            ListNode temp=head;
            int rem=0;
            while(t1!=null&& t2!=null){
                int sum=t1.val+t2.val+rem;
                ListNode new=new ListNode(sum%10);
                rem=sum/10;
                t1=t1.next;
                t2=t2.next;
                temp.next=new;
                temp=temp.next;
            }
            if(t1!=null){
                if(rem!=0){
                    int sum=t1.val+rem;
                    ListNode new=new ListNode(sum);
                }
                temp.next=t1;
            }
            if(t2!=null){
                temp.next=t2;
            }
        }
    }
}
