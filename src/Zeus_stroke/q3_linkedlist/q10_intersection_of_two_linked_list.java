package Zeus_stroke.q3_linkedlist;

import linkedList.ListNode;

public class q10_intersection_of_two_linked_list {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode tempA=headA;
            ListNode tempB=headB;
            int lengthA=length(headA);
            int lengthB=length(headB);
            if(lengthA>lengthB){
                for(int i=0;i<lengthA-lengthB;i++){
                    tempA=tempA.next;
                }
            }
            else{
                for(int i=0;i<lengthB-lengthA;i++){
                    tempB=tempB.next;
                }
            }
            while(tempA!=null && tempB!=null){
                if(tempA==tempB)return tempA;
                tempA=tempA.next;
                tempB=tempB.next;
            }
            return null;
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
