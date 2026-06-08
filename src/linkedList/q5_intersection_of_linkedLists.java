package linkedList;

public class q5_intersection_of_linkedLists {
    static void main() {

    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        ListNode temp2=headB;

        int sA=0;
        while(temp!=null){
            temp=temp.next;
            sA++;
        }

        int sB=0;
        while(temp2!=null){
            temp2=temp2.next;
            sB++;
        }
        int diff=0;

        temp=headA;
        temp2=headB;

       if(sA>sB) {
           diff = sA - sB;
           for(int i=0;i<diff;i++){
              temp=temp.next;
           }
       }
       else if(sA<sB){
           diff = sB-sA;
           for(int i=0;i<diff;i++){
               temp2=temp2.next;
           }
       }

       while(temp!=temp2){
           temp=temp.next;
           temp2=temp2.next;
           if(temp==temp2)return temp2;
       }
       return temp;


    }
}
