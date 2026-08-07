package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

public class q4_merge_2_sorted_lists {
    class Solution {
        public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
            ListNode temp1=head1;
            ListNode temp2=head2;


//            here if i asign t with the head1 then it will create a loop because when i asing temp to t , then when head1 let smaller than head2 at that time i am assigning the
            ListNode t=new ListNode(-1);
            ListNode temp=t;
            while(temp1!=null && temp2!=null){
                if(temp1.val<=temp2.val){
                    temp.next=temp1;
                    temp=temp.next;
                    temp1=temp1.next;
                }
                else{
                    temp.next=temp2;
                    temp=temp.next;
                    temp2=temp2.next;
                }
            }
            if(temp1==null){
                temp.next=temp2;
            }
            if(temp2==null){
                temp.next=temp1;
            }

            return t.next;
        }
    }
}
